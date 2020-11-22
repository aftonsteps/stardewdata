package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class SeedsObjectInformation extends GameData {
	public SeedsObjectInformation(JSONParser parser, String filepath) {
		super(parser, filepath, new String[] {"Seeds -74"});
		  this.name = "Seeds Object Information";
	        this.joinToObjectInfo = false;
	        this.colnames = new String[]{"ObjectId", "Name", "Price", "Edibility", "Type & Category", "Display Name", "Description"};
	}
}
