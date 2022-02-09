package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AnalyticsCounter {
	private static List<String> nomSymptome = new ArrayList<String>();
	private static List<Integer> nbSymptome = new ArrayList<Integer>();
	
	public static void main(String args[]) throws Exception {
		// first get input
		compteurMaladie();
		
		// next generate output
		ecrireTexte();
	}
	
	// Function for counting
	public static void compteurMaladie() throws Exception{
		Boolean exist = false;
		
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		
		// Loop on each line of the file
		while (line != null) {
			// Loop on each line of the nomSymptome array
			for(int i = 0; i < nomSymptome.size(); i++) {
				// If the "line" row matches the name
				if(nomSymptome.get(i).equals(line)) {
					// Adds 1 to the corresponding value of the nbSymptome array
					nbSymptome.set(i, nbSymptome.get(i)+1);
					// nomSymptome exists
					exist = true;
					// End the for loop
					break;
				}
				else {
					// nomSymptome does not exists
					exist = false;
				}
			}

			if(!exist) {
				// Add new nomSymptome and nbSymptome
				nomSymptome.add(line);
				nbSymptome.add(1);
			}

			line = reader.readLine();
		}
		reader.close();
	}
	
	public static void ecrireTexte() throws Exception{
		// next generate output
		// Create file result.out
		FileWriter writer = new FileWriter ("result.out");
		
		// Write in result.out
		for(int i = 0; i < nomSymptome.size(); i++) {
			writer.write(nomSymptome.get(i) + " : " + nbSymptome.get(i) + "\n");
		}
		
		// Close result.out
		writer.close();
	}
}
