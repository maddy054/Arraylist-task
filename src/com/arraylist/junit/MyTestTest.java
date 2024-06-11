package com.arraylist.junit;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.arraylist.exception.InputInvalidException;
import com.arraylist.logics.ArrayListTask;

class MyTestTest {
    
	@Test
	void indexTest() {
		try {
		ArrayListTask myTask = new ArrayListTask();
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("hii");
		assertEquals(0, myTask.getIndex(myList,"hii"));
		
		
		}catch(InputInvalidException e) {
		    e.getMessage();	
		}
	}
	@Test
	@BeforeAll
	void getIndexTest() {
		ArrayListTask myTask = new ArrayListTask();
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("hii");
		ArrayList<String> myList1 = new ArrayList<String>();
		
		
	}

}
