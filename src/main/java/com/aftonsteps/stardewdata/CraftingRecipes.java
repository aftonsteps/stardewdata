package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class CraftingRecipes extends GameData {
	public CraftingRecipes(JSONParser parser, String filepath) {
		super(parser,
				filepath + "/CraftingRecipes.json",
				new String[] {
        				"Name",
        				"Ingredients",
        				"Unused",
        				"Yield Object Id",
        				"Big Craftable",
        				"Unlock Conditions"});
		this.name = "Crafting Recipes";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
	}		
}
