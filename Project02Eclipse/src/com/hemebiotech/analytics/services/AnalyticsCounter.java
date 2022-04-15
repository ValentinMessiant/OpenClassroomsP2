package com.hemebiotech.analytics.services;

import java.util.HashMap;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public void applicationAnalyticsCounter() throws Exception {
		
		ISymptomReader readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		if (!readSymptomDataFromFile.getSymptoms().isEmpty()) {
			
			// Count the occurrence of symptoms
			ISymptomCounter symptomCounter = new SymptomCounterUsingHashMap();
			HashMap<String, Integer> symptomOccurences = symptomCounter.symptomOccurences(readSymptomDataFromFile.getSymptoms());
			
			
			// Sort the symptoms
			ISymptomOrder symptomOrder = new SymptomOrderUsingTreeMap();
			TreeMap<String, Integer> orderSymptoms = symptomOrder.orderSymptoms(symptomOccurences);
			
			
			// Write the symptoms and number of occurrence in a new file
			ISymptomWriter symptomWriter = new SymptomWriterInFile();
			symptomWriter.symptomsWriter(orderSymptoms);
		}
		else {
			System.out.println("Le fichier symptom.txt est vide.");
		}
	}
}
