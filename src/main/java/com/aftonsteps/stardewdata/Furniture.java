package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Furniture extends GameData {
    public Furniture(JSONParser parser, String filepath) {
		super(parser, 
				filepath  + "/furniture.json", 
				new String[] {
						"Object Id", 
						"Name", 
						"Type", 
						"Source Rectangle Width",
						"Source Rectangle Height",
						"Bounding Box Width",
						"Bounding Box Height",
						"Rotations", 
						"Price"
						});
		this.name = "Furniture";
		super.parseIds();
		super.parseContent(new int[] {2, 3}, new int[] {2, 2}, new int[] {}, "\\/");
    }
}
