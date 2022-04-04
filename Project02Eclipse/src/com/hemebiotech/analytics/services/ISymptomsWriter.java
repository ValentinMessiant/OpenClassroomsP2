package com.hemebiotech.analytics.services;

import java.util.TreeMap;

/**
 * Write the ordered list of symptoms and the number of occurence of each symptoms
 * 
 * @author Valentin
 *
 */

public interface ISymptomsWriter {
	/**
	 * 
	 * @param symptomOrdered a TreeMap that contains name and number of occurence of the symptoms
	 */
	
	void SymptomsWriter(TreeMap<String, Integer> symptomOrdered);
}
