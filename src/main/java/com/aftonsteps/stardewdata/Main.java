package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Main {
	public static void main(String[] args) {
		// TODO fix compile warnings when exporting the jar
		String path;
		if (args.length != 0) {
			path = args[0];
		} else {
			path = System.getProperty("user.dir");
		}

		JSONParser parser = new JSONParser();
		
		// Animals
		Animals animals = new Animals(parser, path);
		animals.writeToFile();

		// Big Craftables
		BigCraftables craftTest =
				new BigCraftables(parser, path);
		craftTest.writeToFile();
		
		// Crops
		Crops cropsTest =
				new Crops(parser, path);
		cropsTest.writeToFile();
		
		// Crops Object Information
		CropsObjectInformation cropsObjectInformation =
				new CropsObjectInformation(parser, path);
		cropsObjectInformation.writeToFile();

		// Furniture
		Furniture furnitureTest =
				new Furniture(parser, path);
		furnitureTest.writeToFile();
		
		// Hats
		Hats hats =
				new Hats(parser, path);
		hats.writeToFile();
		
		// Seeds Object Information
		SeedsObjectInformation seedsObjectInformation =
				new SeedsObjectInformation(parser, path);
		seedsObjectInformation.writeToFile();
		
		// Weapons
		Weapons weapons =
				new Weapons(parser, path);
		weapons.writeToFile();
		
	}

}
