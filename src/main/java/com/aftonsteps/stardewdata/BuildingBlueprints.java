package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class BuildingBlueprints extends GameData {
	public BuildingBlueprints(JSONParser parser, String filepath) {
		super(parser,
				filepath + "/Blueprints.json",
				new String[] {
						"Name",
						"Items Required",
						"Tiles Width",
						"Tiles Height",
						"Human Door X Coord",
						"Human Door Y Coord",
						"Animal Door X Coord",
						"Animal Door Y Coord",
						"Map To Warp To",
						"English Name",
						"Description",
						"Blueprint Type",
						"Name Of Building To Upgrade",
						"Source Rectangle For Menu View 1",
						"Source Rectangle For Menu View 2",
						"Max Occupants",
						"Action Behavior",
						"Name Of Building Location",
						"Price",
						"Magical"
				});
		this.name = "Building Blueprints";
		super.parseIds(new String[] {
				"Silo",
				"Mill",
				"Earth Obelisk",
				"Water Obelisk",
				"Desert Obelisk",
				"Junimo Hut",
				"Gold Clock",
				"Stable",
				"Well",
				"Shipping Bin",
				"Coop",
				"Big Coop",
				"Deluxe Coop",
				"Barn",
				"Big Barn",
				"Deluxe Barn",
				"Slime Hutch",
				"Shed",
				"Big Shed",
				"Stone Cabin",
				"Plank Cabin",
				"Log Cabin",
				"Greenhouse",
				"Mine Elevator",
				"Fish Pond"
		});
		super.parseContent(new int[] {}, new int[] {}, new int[] {});
	}
}
