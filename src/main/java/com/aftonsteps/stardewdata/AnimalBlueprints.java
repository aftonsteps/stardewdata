package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class AnimalBlueprints extends GameData {
	public AnimalBlueprints(JSONParser parser, String filepath) {
		super(parser,
				filepath + "/Blueprints.json",
				new String[] {
						"Name",
						"Is Animal",
						"Price",
						"Source Rectangle For Menu View 1",
						"Source Rectangle For Menu View 2",
						"English Name",
						"Description",
						"Null",
						"Is Farm"
				});
		this.name = "Animal Blueprints";
		super.parseIds(new String[] {
				"Chicken",
				"Duck",
				"Rabbit",
				"Cow",
				"Sheep",
				"Goat",
				"Pig",
		});
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
	}
}
