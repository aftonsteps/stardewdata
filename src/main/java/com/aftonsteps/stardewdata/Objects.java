package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Objects extends GameData {
	public Objects(JSONParser parser, String filepath) {
		super(parser, 
				filepath  + "/ObjectInformation.json", 
				new String[] {
						"Object Id", 
						"Name", 
						"Price", 
						"Edibility", 
		        		"Type",
		        		"Category",
		        		"English Name", 
		        		"Description",
		        		"Food and Drink",
		        		"Buffs"});
		this.name = "Objects";
		super.parseIds();
		super.parseContent(new int[] {3}, new int[] {2}, new int[] {}, "\\/");
	}
}
