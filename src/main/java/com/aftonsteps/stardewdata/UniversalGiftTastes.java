package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class UniversalGiftTastes extends GameData {

	public UniversalGiftTastes(JSONParser parser, String filepath) {
		super(parser, 
				filepath + "/NPCGiftTastes.json", 
				new String[] {"Universal_Love",
						"Universal_Like",
						"Universal_Neutral",
						"Universal_Dislike",
						"Universal_Hate"
				},
				0);
		this.name = "Universal Gift Tastes";
		this.colnames = 
				new String[] {
						"Universal Type",
						"Items"
				};
	}

}
