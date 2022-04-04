package com.hemebiotech.analytics.services;

import java.util.HashMap;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public void ApplicationAnalyticsCounter() throws Exception {
		
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		if (!readSymptomDataFromFile.GetSymptoms().isEmpty()) {
			
			// Count the occurence of symptoms
			SymptomCounter symptomCounter = new SymptomCounter();
			HashMap<String, Integer> symptomOccurences = symptomCounter.SymptomOccurences(readSymptomDataFromFile.GetSymptoms());
			
			
			// Sort the symptoms
			SymptomOrder symptomOrder = new SymptomOrder();
			TreeMap<String, Integer> orderSymptoms = symptomOrder.OrderSymptoms(symptomOccurences);
			
			
			// Write the symptoms and number of occurence in a new file
			SymptomWriter symptomWriter = new SymptomWriter();
			symptomWriter.SymptomsWriter(orderSymptoms);
		}
		else {
			System.out.println("Le fichier symptom.txt est vide.");
		}
	}
}
