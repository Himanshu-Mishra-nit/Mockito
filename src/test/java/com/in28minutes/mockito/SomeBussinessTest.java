package com.in28minutes.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.in28minutes.mockito.mockitodemo.DataService;
import com.in28minutes.mockito.mockitodemo.SomeBussinessImpl;

class SomeBussinessTest {

	@Test
	void testFindTheGreatestFromAllData() {
		
		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl(new DataServiceStub());
		int result = bussinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int []{24,6,15};
	}
	
}
