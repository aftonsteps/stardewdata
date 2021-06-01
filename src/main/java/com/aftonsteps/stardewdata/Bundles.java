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
        				"Reward Object ID", 
        				"Number of Reward Object Given",
        				"Required Objects",
        				"Color Index",
        				"Number Of Objects Required"});
        this.name = "Bundles";
		super.parseIds();
		super.parseContent(new int[] {1}, new int[] {3}, new int[] {}, "\\/");
    }
}
