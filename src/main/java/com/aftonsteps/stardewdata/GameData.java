package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import com.opencsv.CSVWriter;
import org.json.simple.JSONObject;

public abstract class GameData {
	
	 public String name;
	 public String[] colnames;
	 public int nrow;
	 public int ncol;
	 protected JSONObject rawContent;
	 public Object[] ids;
	 public String[][] content;
	 
	 // Basic constructor
	 public GameData(JSONParser parser, String filepath, String[] colnames) {
		 this.colnames = colnames;
		 this.ncol = this.colnames.length;
		 try {
			 JSONObject json = (JSONObject) parser.parse(new FileReader(filepath));
			 this.rawContent = (JSONObject) json.get("content");
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 // Parse ID's
	 public void parseIds() {
		 this.ids = this.rawContent.keySet().toArray();
		 this.nrow = this.ids.length;
		 this.content = new String[this.nrow][this.ncol];
	 }
	 
	 // Parse ID's with filtering
	 public void parseIds(String[] filter) {
		 // TODO add a fail-safe here that also filters the filtering set against the existing id's
		 this.ids = filter;
		 this.nrow = this.ids.length;
		 this.content = new String[this.nrow][this.ncol];
	 }
	 
	 // Parse content
	 // If no split elements, then pass empty arrays
	 // If no nulls, then pass empty arrays
	 public void parseContent(int[] splitIdx, int[] splitLengths, int[] nullIdx) {
		 // Loop over each row
		 for (int r=0; r<this.ids.length; r++) {
			 // Get the String data associated with this id, to form a row
			 this.content[r] = new String[this.ncol];
			 String nextItem = (String) this.rawContent.get(ids[r]);
			 System.out.println(nextItem);
			 String[] nextItemData = nextItem.split("\\/");
			 this.content[r][0] = ids[r].toString();
			 
			 // Set up to parse the String data for  this row into array
			 boolean tooShort = nullIdx.length > 0 && (nextItemData.length + 1) < (this.ncol - splitIdx.length);
			 System.out.println(nextItemData.length + 1);
			 System.out.println((this.ncol - splitIdx.length));
			 int nextSplit = 0;
			 int nextNull = 0;
			 int c = 1; // Starts at 1 because 0 index is occupied by the ID
			 
			 // Loop over each element within each row until all the column spaces are filled
			 for (int elem=0; elem<nextItemData.length && c<this.ncol; elem++) {
				 if (tooShort && nextNull < nullIdx.length && elem == nullIdx[nextNull]) {
					 System.out.println("1");
					 // If this is a null-impute element, then add an empty string
					 this.content[r][c] = "";
					 this.content[r][c+1] = nextItemData[elem];
					 c+=2;
				 } else if (nextSplit < splitIdx.length && elem == splitIdx[nextSplit]) {
					 // If this is an element to split, then split
					 String[] splitData = nextItemData[elem].split(" ");
					 System.out.println(nextItemData[elem]);
					 System.out.println("LENGTH " + splitData.length);
					 System.out.println("EXPECTED LENGTH: " + splitLengths[nextSplit]);
					 for (int split = 0; split < splitLengths[nextSplit]; split++) {
						 System.out.println("INDEX " + split);
						 if (split < splitData.length && splitData[split] != null) {
							 System.out.println("DATA " + splitData[split]);
							 this.content[r][c] = splitData[split];
						 } else {
							 this.content[r][c] = "";
						 }
						 c++;
					 }
					 nextSplit++;
				 } else {
					 this.content[r][c] = nextItemData[elem];
					 c++;
				 }
			 }
		 }
	 }
	 
	 public void writeToFile() {
		 try {
			 CSVWriter writer = new CSVWriter(new FileWriter(this.name + ".csv"), ',', '"', '\\', "\r\n");
			 //CSVWriter writer = new CSVWriter(new FileWriter(this.name + ".csv"));
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
