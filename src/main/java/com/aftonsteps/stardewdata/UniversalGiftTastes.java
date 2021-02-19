package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class UniversalGiftTastes extends GameData {

	public UniversalGiftTastes(JSONParser parser, String filepath) {
		super(parser, 
				filepath  + "/NPCGiftTastes.json", 
				new String[] {
						"Universal Type",
						"Items"
        				});
		this.name = "Universal Gift Tastes";
		super.parseIds(new String[] {
				"Universal_Love",
				"Universal_Like",
				"Universal_Neutral",
				"Universal_Dislike",
				"Universal_Hate"
		});
		super.parseContent(new int[] {}, new int[] {}, new int[] {});
	}

}
