package com.hemebiotech.analytics;

import com.hemebiotech.analytics.services.SymptomReaderServices;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		SymptomReaderServices symptomReaderServices = new SymptomReaderServices();
		// first get input
		symptomReaderServices.countSymptoms();
		// sort the list
		symptomReaderServices.sortSymptoms();
		// next generate output
		symptomReaderServices.writeSymptoms();
	}
}
