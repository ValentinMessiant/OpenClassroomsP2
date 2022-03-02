package com.hemebiotech.analytics.services;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hemebiotech.analytics.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.entities.Symptome;

public class SymptomReaderServices {
	ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
	List<String> readSymptoms = readSymptomDataFromFile.GetSymptoms();
	List<Symptome> symptoms = new ArrayList<Symptome>();
	
	// This function allows to count the symptoms of the given file.
	public void countSymptoms() throws Exception{
		Boolean exist = false;
		// Loop on each line of the file
		for (String line : readSymptoms) {
			for (Symptome symptome : symptoms) {
				if(symptome.getName().equals(line)) {
					symptome.setCount(symptome.getCount()+1);
					exist = true;
					break;
				}
				else {
					exist = false;
				}
			}
			
			if(!exist) {
				Symptome spt = new Symptome();
				spt.setName(line);
				spt.setCount(1);
				symptoms.add(spt);
			}
		}
	}
	
	// This function sorts the list of symptoms.
	public void sortSymptoms() throws Exception{
		Collections.sort(symptoms);
	}
	
	// This function allows you to create a result.out file and write the list of symptoms in it.
	public void writeSymptoms() throws Exception{
		// next generate output
		// Create file result.out
		FileWriter writer = new FileWriter ("result.out");
		
		// Write in result.out
		for (Symptome symptome : symptoms) {
			writer.write(symptome.getName() + " : " + symptome.getCount() + "\n");
		}
		
		writer.close();
	}
}
