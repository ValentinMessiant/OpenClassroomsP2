package com.hemebiotech.analytics;

import com.hemebiotech.analytics.services.AnalyticsCounter;

public class Main {
	public static void main(String args[]) throws Exception {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.applicationAnalyticsCounter();
	}
}
