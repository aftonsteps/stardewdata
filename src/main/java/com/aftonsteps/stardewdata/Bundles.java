package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Bundles extends GameData {
    public Bundles(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/Bundles.json",
        		new String[] {
        				"Room Id & Sprite Index", 
        				"Bundle Name", 
        				"Type Of Object", 
        				"Object Id", 
        				"Number of Object Given", 
        				"Color Index", 
        				"Number Of Items", 
        				"English Name"});
        this.name = "Bundles";
		super.parseIds();
		super.parseContent(new int[] {1, 2}, new int[] {3, 3}, new int[] {}, "\\/");
    }
}
