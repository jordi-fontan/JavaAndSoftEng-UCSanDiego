package com.dalneg.portfolio.storyTelling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(" Testing Word COunt Class")
public class TestWordCount {
static WordCount wc;
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		 wc=new WordCount("c:\\sharedData\\testTextFileToString.txt");
		System.out.println("Before Class");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	
		System.out.println("After Class");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Before ");
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public final void testTextFiletoString() {
		//WordCount wc=new WordCount("c:\\sharedData\\testTextFileToString.txt");
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

	@org.junit.jupiter.api.Test
	@DisplayName("A list with the words of a string")
	public final void testFromStringToList() {
		//WordCount wc=new WordCount("c:\\sharedData\\testTextFileToString.txt");
		List<String> list=new ArrayList<>();
		list.add("This");
		list.add("is");
		list.add("a");
		list.add("test");
		
		String s="This is a test";
		@SuppressWarnings("unused")
		String message="The list with a string 'This is a test' should be equels to test method with 'This is a test' as parameter \t\n";
		assertEquals(list,wc.fromStringToList(s));
	}
	
}
