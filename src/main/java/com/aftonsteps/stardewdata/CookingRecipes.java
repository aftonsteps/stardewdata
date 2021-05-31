package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class CookingRecipes extends GameData {
	public CookingRecipes(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/CookingRecipes.json",
        		new String[] {
        				"Name",
        				"Ingredients",
        				"Unused",
        				"Yield Object Id",
        				"Unlock Conditions"});
        this.name = "Cooking Recipes";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
	}
}
