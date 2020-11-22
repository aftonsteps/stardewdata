package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class CropsObjectInformation extends GameData {
	public CropsObjectInformation(JSONParser parser, String filepath) {
		super(parser, 
				filepath  + "/ObjectInformation.json", 
				new String[] {"Basic -75", "Basic -79", "Basic -80"});
        this.name = "Crops Object Information";
        this.joinToObjectInfo = false;
        this.colnames = new String[]{"ObjectId", "Name", "Price", "Edibility", 
        		"Type & Category", "Display Name", "Description"};
	}
}
