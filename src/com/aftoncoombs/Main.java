package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {
	// Setup singletons
        JSONParser parser = new JSONParser();

//        BigCraftables craftTest =
//                new BigCraftables(parser, "/Users/aftoncoombs/Projects/rstardew/data-raw/unpacked/BigCraftablesInformation.json", new int[] {3}, new int[] {2});
//        craftTest.writeToFile();
        Crops cropsTest =
                new Crops(parser,
                        "/Users/aftoncoombs/Projects/rstardew/data-raw/unpacked/Crops.json",
                        new int[] {0, 6},
                        new int[] {5, 5});
        cropsTest.writeToFile();
    }
}
