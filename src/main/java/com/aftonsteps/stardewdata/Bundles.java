package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Bundles extends GameData {
    public Bundles(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/Bundles.json",
        		new String[] {
        				"Room Id And Sprite Index", 
        				"Bundle Name", 
        				"Reward Type Of Object", 
        				"Reward Objects", 
        				"Number of Reward Objects Given",
        				"Required Objects",
        				"Color Index",
        				"Number Of Items Required"});
        this.name = "Bundles";
		super.parseIds();
		super.parseContent(new int[] {1}, new int[] {3}, new int[] {}, "\\/");
    }
}
