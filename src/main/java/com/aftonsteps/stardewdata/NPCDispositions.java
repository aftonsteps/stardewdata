package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class NPCDispositions extends GameData {
	
	public NPCDispositions(JSONParser parser, String filepath) {
		super(parser, filepath + "/NPCDispositions.json", 10, 2);
		this.name = "NPC Dispositions";
		this.colnames = 
				new String[] {
						"Name",
						"Age",
						"Manners",
						"Social Anxiety",
						"Optimism",
						"Gender",
						"Datable",
						"Love Interest",
						"Home Region",
						"Birthday",
						"Relationships"
				};
	}
}
