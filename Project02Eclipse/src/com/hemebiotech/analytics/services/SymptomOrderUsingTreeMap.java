package com.hemebiotech.analytics.services;

import java.util.HashMap;
import java.util.TreeMap;

public class SymptomOrderUsingTreeMap implements ISymptomOrder{
	
	@Override
	public TreeMap<String, Integer> orderSymptoms(HashMap<String, Integer> nonOrderedSymptoms){
		TreeMap<String, Integer> symptomOrder = new TreeMap<String, Integer>(nonOrderedSymptoms);

		return symptomOrder;
	}
}
