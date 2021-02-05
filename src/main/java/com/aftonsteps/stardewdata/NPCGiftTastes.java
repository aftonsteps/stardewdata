package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class NPCGiftTastes extends GameData {

	public NPCGiftTastes(JSONParser parser, String filepath) {
		super(parser, 
				filepath + "/NPCGiftTastes.json", 
				new String[] {"Robin", 
						"Demetrius",
						"Maru",
						"Sebastian",
						"Linus",
						"Pierre",
						"Caroline",
						"Abigail",
						"Alex",
						"George",
						"Evelyn",
						"Lewis",
						"Clint",
						"Penny",
						"Pam",
						"Emily",
						"Haley",
						"Jas",
						"Vincent",
						"Jodi",
						"Kent",
						"Sam",
						"Leah",
						"Shane",
						"Marnie",
						"Elliott",
						"Gus",
						"Dwarf",
						"Wizard",
						"Harvey",
						"Sandy",
						"Willy",
						"Krobus"},
				0);
		this.name = "NPC Gift Tastes";
		this.colnames = 
				new String[] {
						"Character Name",
						"Love Dialogue",
						"Loved Items",
						"Like Dialogue",
						"Liked Items",
						"Dislike Dialogue",
						"Disliked Items",
						"Hate Dialogue",
						"Hated Items",
						"Neutral Dialogue",
						"Neutral Items"
				};
	}

}
