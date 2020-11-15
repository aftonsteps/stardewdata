package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Main {
	public static void main(String[] args) {
		String path;
		if (args.length != 0) {
			path = args[0];
		} else {
			path = System.getProperty("user.dir");
		}

		path = "/Users/aftoncoombs/Projects/unpacked";

		JSONParser parser = new JSONParser();

		// Big Craftables
		BigCraftables craftTest =
				new BigCraftables(parser, path + "/BigCraftablesInformation.json", new int[] {3}, new int[] {2});
		craftTest.writeToFile();
		
		// Crops
		Crops cropsTest =
				new Crops(parser,
						path  + "/Crops.json",
						new int[] {0, 6},
						new int[] {5, 5});
		cropsTest.writeToFile();

		// Furniture
		Furniture furnitureTest =
				new Furniture(parser, path + "/furniture.json");
		furnitureTest.writeToFile();
		
		// Hats
		Hats hats =
				new Hats(parser, path + "/hats.json", 5, 4);
		hats.writeToFile();
		
		// Objects
		Objects objects =
				new Objects(parser, path + "/ObjectInformation.json", new int[] {3}, new int[] {2});
		objects.writeToFile();
		
		// Weapons
		Weapons weapons =
				new Weapons(parser, path + "/weapons.json");
		weapons.writeToFile();
	}

}
