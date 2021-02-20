package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Achievements extends GameData {
	public Achievements(JSONParser parser, String filepath) {
		super(parser,
				filepath + "/Achievements.json",
				new String[] {
						"Id",
						"Name",
						"Description",
						"Display On Collections Tab Before Earned",
						"Prerequisite Achievement",
						"Hat Earned"
				});
		this.name = "Achievements";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {});
	}
}
