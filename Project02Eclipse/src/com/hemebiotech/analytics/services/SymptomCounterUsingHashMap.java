package com.hemebiotech.analytics.services;

import java.util.HashMap;
import java.util.List;

public class SymptomCounterUsingHashMap implements ISymptomCounter{
	
	
	@Override
	public HashMap<String, Integer> symptomOccurences(List<String> listSymptoms){
		HashMap<String, Integer> symptomOccurences = new HashMap<String, Integer>();
		
		for (String symptom : listSymptoms) {
			if(symptomOccurences.containsKey(symptom)) {
				// Increment the occurrence of the symptom by 1
				symptomOccurences.put(symptom, symptomOccurences.get(symptom)+1);
			}
			else {
				// Add a new symptom
				symptomOccurences.put(symptom, 1);
			}
		}
		return symptomOccurences;
	}
}
