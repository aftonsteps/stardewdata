package com.aftoncoombs;

import com.opencsv.CSVWriter;
import org.apache.commons.lang3.ObjectUtils;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.FileWriter;

public abstract class GameData {
    public String name;
    protected boolean joinToObjectInfo;
    protected JSONParser parser;
    public String[][] content;

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
            for (int i=1; i<obIds.length; i++) {
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

    public GameData(JSONParser parser, String filepath, int[] splitIdx) {
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
            int content_idx = 1;

            // Fill the content row, splitting cells where required by splitIdx[]
            for (int i=1; i<obIds.length; i++) {
                int nextSplitIdx = 0;
                String id = obIds[i].toString();
                String nextItem = (String) rawContent.get(id);
                String[] nextItemData = nextItem.split("\\/");
                content[content_idx] = new String[nextItemData.length + splitIdx.length + 1];
                content[content_idx][0] = id;
                content_idx++;
                for (int j=0; j<nextItemData.length; j++) {
                    // If this element of item data is an idx to split, then split it, else continue
                    if (nextSplitIdx < splitIdx.length && j == splitIdx[nextSplitIdx]) {
                        String[] nextItemDataSplit = nextItemData[j].split(" ");
                        for (int k=0; k<nextItemDataSplit.length;k++) {
                            content[i][j+k+1] = nextItemDataSplit[k];
                        }
                        nextSplitIdx++;
                    } else {
                        content[i][j + nextSplitIdx + 1] = nextItemData[j];
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(this.name + ".csv"), ',');
            for (int i=0; i<this.content.length; i++) {
                writer.writeNext(content[i]);
            }
            writer.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public String toString() {
        return(this.content[0].toString());
    }
}
