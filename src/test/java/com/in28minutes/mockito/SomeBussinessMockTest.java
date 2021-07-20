package com.in28minutes.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.in28minutes.mockito.mockitodemo.DataService;
import com.in28minutes.mockito.mockitodemo.SomeBussinessImpl;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBussinessMockTest {

	@Test
	void testFindTheGreatestFromAllData() {
	DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {24,15,6});
		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl(dataServiceMock);
		int result = bussinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}


