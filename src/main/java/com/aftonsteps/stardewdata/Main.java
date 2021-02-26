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

		JSONParser parser = new JSONParser();
		
		// TODO add x, y coord to 1, 2 box column names
		
		// Achievements
		Achievements achievements = new Achievements(parser, path);
		achievements.writeToFile();
		
		// Animals
		Animals animals = new Animals(parser, path);
		animals.writeToFile();
		
		// Animal Blueprints
		AnimalBlueprints animalBlueprints = new AnimalBlueprints(parser, path);
		animalBlueprints.writeToFile();

		// Big Craftables
		BigCraftables bigCraftables =
				new BigCraftables(parser, path);
		bigCraftables.writeToFile();
		
		// Building Blueprints
		BuildingBlueprints buildingBlueprints = new BuildingBlueprints(parser, path);
		buildingBlueprints.writeToFile();
		
		// Bundles
		Bundles bundles = new Bundles(parser, path);
		bundles.writeToFile();
		
		// Crops
		Crops cropsTest =
				new Crops(parser, path);
		cropsTest.writeToFile();
		
		// Crops Object Information
		CropsObjectInformation cropsObjectInformation =
				new CropsObjectInformation(parser, path);
		cropsObjectInformation.writeToFile();
		
		// Fish
		TrappedFish trappedFish = new TrappedFish(parser, path);
		trappedFish.writeToFile();
		CaughtFish caughtFish = new CaughtFish(parser, path);
		caughtFish.writeToFile();
		
		// TODO: Should split the bounding box for furniture
		// Furniture
		Furniture furnitureTest =
				new Furniture(parser, path);
		furnitureTest.writeToFile();
		
		// Hats
		Hats hats =
				new Hats(parser, path);
		hats.writeToFile();
		
		// NPC Dispositions
		NPCDispositions npcDispositions = new NPCDispositions(parser, path);
		npcDispositions.writeToFile();
		
		// NPC Gift Tastes
		NPCGiftTastes npcGiftTastes = 
				new NPCGiftTastes(parser, path);
		npcGiftTastes.writeToFile();
		
		// Quests
		// TODO missing reaction dialogue
		Quests quests = new Quests(parser, path);
		quests.writeToFile();
		
		// Seeds Object Information
		SeedsObjectInformation seedsObjectInformation =
				new SeedsObjectInformation(parser, path);
		seedsObjectInformation.writeToFile();
		
		// Universal Gift Tastes
		UniversalGiftTastes universalGiftTastes =
				new UniversalGiftTastes(parser, path);
		universalGiftTastes.writeToFile();
		
		// Weapons
		Weapons weapons =
				new Weapons(parser, path);
		weapons.writeToFile();
		
	}

}
