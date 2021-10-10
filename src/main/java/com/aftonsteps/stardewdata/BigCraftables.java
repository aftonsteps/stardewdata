package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class BigCraftables extends GameData {
    public BigCraftables(JSONParser parser, String filepath) {
    	super(parser, 
				filepath  + "/BigCraftablesInformation.json", 
				new String[] {
						"Object Id", 
						"Name", 
						"Price", 
						"Edibility", 
						"Type", 
						"Category", 
						"Description", 
						"Can be set outdoors", 
						"Can be set indoors", 
						"Fragility", 
						"English Name",
						"Is Lamp"
						});
		this.name = "Big Craftables";
		super.parseIds();
		super.parseContent(new int[] {3, 10}, new int[] {2, 2}, new int[] {8}, "\\/");
    }
}
