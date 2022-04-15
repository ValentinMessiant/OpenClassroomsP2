package com.hemebiotech.analytics.services;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Convert HashMap to TreeMap in order to sort the symptoms
 * 
 * @author Valentin
 *
 */

public interface ISymptomOrder {
	/**
	 * @param NonOrderedSymptoms a map with the name of symptoms as the key and the number of occurrence as the value
	 * 
	 * @return the TreeMap with all the symptoms sorted by names
	 */
	TreeMap<String, Integer> orderSymptoms(HashMap<String, Integer> nonOrderedSymptoms);
}
