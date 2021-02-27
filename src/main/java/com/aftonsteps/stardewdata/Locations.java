package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Locations extends GameData {
	public Locations(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/Locations.json",
        		new String[] {
        				"Name",
        				"Spring Foraging", 
        				"Summer Foraging",
        				"Fall Foraging",
        				"Winter Foraging",
        				"Spring Fishing",
        				"Summer Fishing",
        				"Fall Fishing",
        				"Winter Fishing",
        				"Artifact Data"});
        this.name = "Locations";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
	}
}
