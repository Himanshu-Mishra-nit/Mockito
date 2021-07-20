package com.in28minutes.mockito.mockitodemo;

public class SomeBussinessImpl {
	private DataService dataService;

	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for (int value : data) {
			greatest = Math.max(value, greatest);
		}
		return greatest;
	}

	public SomeBussinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

}


