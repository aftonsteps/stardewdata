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
        				"Reward Object Id", 
        				"Reward Number of Object Given", 
        				"Required Object Id", 
        				"Required Number Of Objects", 
        				"Required Min Quality of Objects",
        				"Color Index",
        				"Count Number Within Bundle"});
        this.name = "Bundles";
		super.parseIds();
		super.parseContent(new int[] {1, 2}, new int[] {3, 3}, new int[] {}, "\\/");
    }
}
