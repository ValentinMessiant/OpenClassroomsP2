package com.hemebiotech.analytics.services;

import java.util.TreeMap;

/**
 * Write the ordered list of symptoms and the number of occurrence of each symptoms
 * 
 * @author Valentin
 *
 */

public interface ISymptomWriter {
	/**
	 * 
	 * @param symptomOrdered a TreeMap that contains name and number of occurrence of the symptoms
	 */
	
	void SymptomsWriter(TreeMap<String, Integer> symptomOrdered);
}
