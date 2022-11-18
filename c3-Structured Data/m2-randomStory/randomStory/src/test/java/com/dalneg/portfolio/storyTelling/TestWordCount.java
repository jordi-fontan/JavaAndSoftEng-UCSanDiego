package com.dalneg.portfolio.storyTelling;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWordCount {
static WordCount wc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testTextFiletoString() {
		WordCount wc=new WordCount("c:\\sharedData\\testTextFileToString.txt");
		String test=null;
		try {
			test=wc.textFileToString("c:\\sharedData\\testTextFileToString.txt");
			System.out.println(test);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue("This is a test".equals(test.strip()));
	}

	@Test
	public final void testFromStringToList() {
		WordCount wc=new WordCount("c:\\sharedData\\testTextFileToString.txt");
		List<String> list=new ArrayList<>();
		list.add("This");
		list.add("is");
		list.add("a");
		list.add("test");
		
		String s="This is a test";
		
		assertTrue(list.equals(wc.fromStringToList(s)));
	}
	
}
