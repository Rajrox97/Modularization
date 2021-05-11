package com.in28minutes.consumer;

import com.in28minutes.sorting.util.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer {
	
	private static Logger logger = 
			Logger.getLogger(MySortingUtilConsumer.class.getName());
	
	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = 
				util.sort(List.of("Rituraj","Mahima","Satish","Adam","Eve")); //This is not sorted per se but only logging. The sort functionality is not built into this. 
		logger.info(sorted.toString());
	}
}
