package com.hemebiotech.analytics.services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SymptomWriterInFile implements ISymptomWriter{

	@Override
	public void SymptomsWriter(TreeMap<String, Integer> symptomOrdered) {
		// Create file result.out
		try {
			FileWriter writer = new FileWriter ("result.out");
			
			// Write in result.out
			Set<Entry<String,Integer>> symptomName = symptomOrdered.entrySet();
			
			for (Entry symptome : symptomName) {
				writer.write(symptome.getKey() + " : " + symptome.getValue() + "\n");
			}
			
			writer.close();
		}
		catch (IOException e) {
			System.out.println("Impossible de générer le fichier de sortie result.out");
			System.out.println("Exception: " + e);
		}
		return;
	}
}
