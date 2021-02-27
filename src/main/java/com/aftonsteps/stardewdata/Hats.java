package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

// TODO fix column names

public class Hats extends GameData {
    public Hats(JSONParser parser, String filepath) {
		super(parser, 
				filepath  + "/hats.json", 
				new String[] {
						"Object Id", 
						"Name", 
						"Description", 
						"Skip Hair Draw", 
						"Ignore Hairstyle Offset", 
						"Prismatic"});
		this.name = "Hats";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {4}, "\\/");
    }
}