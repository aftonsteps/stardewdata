package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Events extends GameData {

	public Events(JSONParser parser, String filepath) {
		super(parser, filepath + "/Events.json");
		this.name = "Events";
		this.colnames = 
				new String[] {
						"Event",
						"Dialogue"
				};
	}

}
