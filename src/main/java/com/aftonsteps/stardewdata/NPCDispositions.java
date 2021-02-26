package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class NPCDispositions extends GameData {
	
	public NPCDispositions(JSONParser parser, String filepath) {
			super(parser, 
					filepath  + "/NPCDispositions.json", 
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
							});
			this.name = "Hats";
			super.parseIds();
			super.parseContent(new int[] {}, new int[] {}, new int[] {2}, "\\/");
			this.name = "NPC Dispositions";
	}
}
