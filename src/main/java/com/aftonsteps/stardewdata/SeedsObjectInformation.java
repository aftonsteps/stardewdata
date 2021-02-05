package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class SeedsObjectInformation extends GameData {
	public SeedsObjectInformation(JSONParser parser, String filepath) {
		super(parser, filepath  + "/ObjectInformation.json", new String[] {"Seeds -74"}, 3);
		  this.name = "Seeds Object Information";
	        this.joinToObjectInfo = false;
	        this.colnames = 
	        		new String[]{"ObjectId", "Name", "Price", "Edibility", "Type & Category",
	        				"Display Name", "Description"};
	}
}
