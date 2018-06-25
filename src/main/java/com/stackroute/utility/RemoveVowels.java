package com.stackroute.utility;

public class RemoveVowels {
	
	public String[] removingVowels(String[] places) {
		String[] alteredPlaces = new String[places.length];
		
		for(int i=0;i<places.length;i++) {
			for(int j =0;j<places[i].length();j++) {
				alteredPlaces[i]= places[i].replaceAll("a|e|i|o|u|A|E|I|O|U","");
			}
		}
		return alteredPlaces;
	}

}
