package com.hemebiotech.analytics.services;

import java.util.HashMap;
import java.util.List;

/**
 * Count every occurrence in a list of symptoms sent in parameters
 * Set the symptom's name as the key
 * and the number of occurrence as the value
 * 
 * The returned map is not sorted
 * 
 * @author Valentin
 *
 */

public interface ISymptomCounter {
	/**
	 * @param listSymptoms a list of symptoms with many duplications
	 * 
	 * @return a HashMap with the name of the symptom as the key and his number of occurrence as the value
	 */
	
	HashMap<String, Integer> symptomOccurences(List<String> listSymptoms);
}
