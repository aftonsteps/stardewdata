package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import com.opencsv.CSVWriter;
import org.json.simple.JSONObject;

public abstract class GameData {
	
	 public String name;
	 protected boolean joinToObjectInfo;
	 protected JSONParser parser;
	 public String[][] content;
	 public String[] colnames;
	 
	 	// Basic constructor
	    public GameData(JSONParser parser, String filepath) {
	        this.parser = parser;
	        try {
	            // Parse JSON data
	            Object obj = parser.parse(new FileReader(filepath));
	            JSONObject json = (JSONObject) obj;

	            // Get content data
	            JSONObject rawContent =  (JSONObject) json.get("content");
	            Object[] obIds = rawContent.keySet().toArray();

	            // Store each object's id and content in a row
	            content = new String[obIds.length + 1][];
	            for (int i=0; i<obIds.length; i++) {
	                String id = obIds[i].toString();
	                String nextItem = (String) rawContent.get(id);
	                String[] nextItemData = nextItem.split("\\/");
	                content[i] = new String[nextItemData.length + 1];
	                content[i][0] = id;
	                for (int j = 0; j<nextItemData.length; j++) {
	                    content[i][j + 1] = nextItemData[j];
	                }
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	 	// Constructor in case of subsetting to certain category values e.g. Objectinfo
	    public GameData(JSONParser parser, String filepath, String[] categories, int categoryIdx) {
	        this.parser = parser;
	        try {
	            // Parse JSON data
	            Object obj = parser.parse(new FileReader(filepath));
	            JSONObject json = (JSONObject) obj;

	            // Get content data
	            JSONObject rawContent =  (JSONObject) json.get("content");
	            Object[] obIds = rawContent.keySet().toArray();

	            // Store each object's id and content in a row
	            content = new String[obIds.length + 1][];
	            // Use a counter to skip over rows we don't want
	            int counter = 1;
	            for (int i=0; i<obIds.length; i++) {
	                String id = obIds[i].toString();
                	// If the category array is the ids (idx 0) then filter here
	                if (categoryIdx != 0 || Arrays.asList(categories).contains(id)) {
		                String nextItem = (String) rawContent.get(id);
		                String[] nextItemData = nextItem.split("\\/");
		                // If category Idx == 0, proceed parsing everything
		                // If categoryIdx != 0, then check appropriate element for filtering
		                if (categoryIdx == 0 || nextItemData.length >= (categoryIdx + 1) &&
		                		Arrays.asList(categories).contains(nextItemData[categoryIdx])) {
			                content[counter] = new String[nextItemData.length + 1];
			                content[counter][0] = id;
			                for (int j = 0; j<nextItemData.length; j++) {
			                    content[counter][j + 1] = nextItemData[j];
			                }
			                counter++;
		                }
	                }
	       
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    // Constructor in case of nulls jagged array
	    public GameData(JSONParser parser, String filepath, int contentLength, int nullIdx) {
	    	 this.parser = parser;
		        try {
		            // Parse JSON data
		            Object obj = parser.parse(new FileReader(filepath));
		            JSONObject json = (JSONObject) obj;

		            // Get content data
		            JSONObject rawContent =  (JSONObject) json.get("content");
		            Object[] obIds = rawContent.keySet().toArray();

		            // Store each object's id and content in a row
		            content = new String[obIds.length + 1][];
		            for (int i=0; i<obIds.length; i++) {
		                String id = obIds[i].toString();
		                String nextItem = (String) rawContent.get(id);
		                String[] nextItemData = nextItem.split("\\/");
		                content[i] = new String[contentLength + 1];
		                content[i][0] = id;
		                boolean skipBack = true;
		                for (int j=0; j<contentLength; j++) {
		                	if (j >= nextItemData.length) {
		                		content[i][j + 1] = " "; // TODO should this be NA not " " ?
		                	} else if (skipBack &&
			                		nextItemData.length<(contentLength) && 
			                		j==(nullIdx)) {
			                	content[i][j + 1] = " "; // TODO should this be NA not " " ?
			                	j--;
			                	skipBack = false;
			                } else {
			                	content[i][j + 1] = nextItemData[j];
			                	skipBack = true;
			                }
		                }
		            }
		        } catch(Exception e) {
		            e.printStackTrace();
		        }
	    }

	    // Constructor in case of splittable elements
	    public GameData(JSONParser parser, String filepath, int[] splitIdx, int[] lengths) {
	        this.parser = parser;
	        try {
	            // Parse JSON data
	            Object obj = parser.parse(new FileReader(filepath));
	            JSONObject json = (JSONObject) obj;

	            // Get content data
	            JSONObject rawContent =  (JSONObject) json.get("content");
	            Object[] obIds = rawContent.keySet().toArray();

	            // Store each object's id and content in a row. Set number of rows to num id's + 1 for title
	            this.content = new String[obIds.length + 1][];
	            int contentIdx = 0;
	            int additionalCols = Arrays.stream(lengths).sum() - lengths.length;

	            // Fill the content row, splitting cells where required by splitIdx[]
	            for (int i=0; i<obIds.length; i++) {
	                int nextSplitIdx = 0;
	                int cumulativeOffset = 1;
	                String id = obIds[i].toString();
	                String nextItem = (String) rawContent.get(id);
	                String[] nextItemData = nextItem.split("\\/");
	                // Set number of columns to be 1 id col + raw content length + new cols due to splitting
	                content[contentIdx] = new String[nextItemData.length + additionalCols + 1];
	                content[contentIdx][0] = id;
	                contentIdx++;
	                for (int j=0; j<nextItemData.length; j++) {
	                    // If this element of item data is an idx to split, then split it, else continue
	                    if (nextSplitIdx < splitIdx.length && j == splitIdx[nextSplitIdx]) {
	                        String[] nextItemDataSplit = nextItemData[j].split(" ");
	                        for (int k=0; k<lengths[nextSplitIdx]; k++) {
	                            if (k<nextItemDataSplit.length) {
	                                content[i][j+k+cumulativeOffset] = nextItemDataSplit[k];
	                            } else {
	                                content[i][j+k+cumulativeOffset] = "NA";
	                            }
	                        }
	                        cumulativeOffset += lengths[nextSplitIdx] - 1;
	                        nextSplitIdx++;
	                    } else {
	                        content[i][j + cumulativeOffset] = nextItemData[j];
	                    }
	                }
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    // Constructor in case of splittable elements AND nulls (jagged array)
	    public GameData(JSONParser parser, String filepath, int[] splitIdx, int[] lengths, int contentLength, int nullIdx) {
	        this.parser = parser;
	        try {
	            // Parse JSON data
	            Object obj = parser.parse(new FileReader(filepath));
	            JSONObject json = (JSONObject) obj;

	            // Get content data
	            JSONObject rawContent =  (JSONObject) json.get("content");
	            Object[] obIds = rawContent.keySet().toArray();

	            // Store each object's id and content in a row. Set number of rows to num id's + 1 for title
	            this.content = new String[obIds.length + 1][];
	            int contentIdx = 0;
	            int additionalCols = Arrays.stream(lengths).sum() - lengths.length;

	            // Fill the content row, splitting cells where required by splitIdx[]
	            for (int i=0; i<obIds.length; i++) {
	                int nextSplitIdx = 0;
	                int cumulativeOffset = 1;
	                String id = obIds[i].toString();
	                String nextItem = (String) rawContent.get(id);
	                String[] nextItemData = nextItem.split("\\/");
	               	// If this is the element to code as null, then do so
                	boolean imputeNull = false;
                	int thisRowsAdditionalCols = additionalCols;
                	if (nextItemData.length < (contentLength - additionalCols)) {
                		imputeNull = true;
                	}
                	
                	if (!imputeNull) { thisRowsAdditionalCols--; }
                	
	                // Set number of columns to be 1 id col + raw content length + new cols due to splitting
	                content[contentIdx] = new String[nextItemData.length + thisRowsAdditionalCols + 1];
	                content[contentIdx][0] = id;
	                contentIdx++;
	                for (int j=0; j<nextItemData.length; j++) {
	                    // If this element of item data is an idx to split, then split it, else continue
	                    if (nextSplitIdx < splitIdx.length && j == splitIdx[nextSplitIdx]) {
	                        String[] nextItemDataSplit = nextItemData[j].split(" ");
	                        for (int k=0; k<lengths[nextSplitIdx]; k++) {
	                            if (k<nextItemDataSplit.length) {
	                                content[i][j+k+cumulativeOffset] = nextItemDataSplit[k];
	                            } else {
	                                content[i][j+k+cumulativeOffset] = "NA";
	                            }
	                        }
	                        cumulativeOffset += lengths[nextSplitIdx] - 1;
	                        nextSplitIdx++;
	                    } else {
	                    	if (imputeNull && (j + cumulativeOffset) == nullIdx) {
	                    		content[i][j + cumulativeOffset] = " "; // TODO should this be NA?
	                    		content[i][j + cumulativeOffset + 1] = nextItemData[j];
	                    	} else {
	                    		content[i][j + cumulativeOffset] = nextItemData[j];
	                    	}

	                    }
	                }
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void writeToFile() {
	        try {
	            //CSVWriter writer = new CSVWriter(new FileWriter(this.name + ".csv"), ',', '"', '\\', "\r\n");
	            CSVWriter writer = new CSVWriter(new FileWriter(this.name + ".csv"));
	            writer.writeNext(colnames);
	            for (int i=0; i<this.content.length; i++) {
	                writer.writeNext(content[i]);
	            }
	            writer.close();
	        } catch(Exception e){
	            e.printStackTrace();
	        }
	    }
}
