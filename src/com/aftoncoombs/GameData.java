package com.aftoncoombs;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import java.io.FileReader;

public abstract class GameData {
    public String name;
    protected boolean joinToObjectInfo;
    protected JSONParser parser;
    protected String rawData;
    protected String[] ids;

    public GameData(JSONParser parser, String filepath) {
        this.parser = parser;
        try {
            Object obj = parser.parse(new FileReader(filepath));
            JSONObject json = (JSONObject) obj;
            JSONObject content =  (JSONObject) json.get("content");
            this.rawData = content.toString();
            Object[] obIds = content.keySet().toArray();
            String[] ids = new String[obIds.length];
            for (int i=0; i<obIds.length; i++) {
                ids[i] = obIds[i].toString();
            }
            this.ids = ids;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String getRawData() {
        return(this.rawData);
    }

    // TODO: Remove this after testing is done.
    public void printIds() {
        for (int i=0; i <this.ids.length; i++) {
            System.out.println(this.ids[i]);
        }
    }
}
