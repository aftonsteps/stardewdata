package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

// TODO fix trailing comma on some rows in Animals data

public class Animals extends GameData {

	public Animals(JSONParser parser, String filepath) {
		super(parser, filepath  + "/FarmAnimals.json");
		this.name = "Animals";
		this.colnames = 
				new String[] {
						"Name",
						"Days To Produce", 
						"Age When Mature", 
						"Default Produce Index", 
						"Deluxe Produce Index", 
						"Sound", 
						"Bounding Box Front X", 
						"Bounding Box Front Y", 
						"Bounding Box Front Width", 
						"Bounding Box Front Height",
						"Bounding Box Side X", 
						"Bounding Box Side Y", 
						"Bounding Box Side Width", 
						"Bounding Box Side Height",
						"Harvest Type",
						"Change Texture When Item Ready",
						"Building Type",
						"Sprite Size Front Width",
						"Sprite Size Front Height",
						"Sprite Size Side Width",
						"Sprite Size Side Height",
						"Fullness Drain",
						"Happiness Drain",
						"Meat Index",
						"Sell Price",
						"English Display Type",
						"English Display Building"
						};
	}

}
