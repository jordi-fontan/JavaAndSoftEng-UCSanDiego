package com.dalneg.portfolio.storyTelling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * Assignment 1: Most Frequent Word

You will write a program to determine the word that occurs the most often in a file.
 If more than one word occurs as the most often, then return the first such word found. 
 You should make all words lowercase before counting them. 
Thus, “This” and “this” will both be counted as the lowercase version of “this”.
 You should not consider punctuation, so “end” and “end,” will be considered different words. 
 Use the WordFrequencies program in the lesson as a starting point.

Specifically, you should do the following:

    
        Add code to the tester method to determine and print the word that occurs the most often in a selected file and how many times it occurs. You should find it helpful to call findIndexOfMax.

For example, if the file were testwordfreqs.txt:

        This is a test. Yes a test of a test. Test.

Then the output would be:


Number of unique words: 7
1 this
1 is
3 a
3 test.
1 yes
1 test
1 of
The word that occurs most often and its count are: a 3
 */
public class WordCount {
/*
 * 
 * Create two private variables. 
    One is called myWords and should be an ArrayList of type String to store unique words from a file, 
    and one is called myFreqs and should be an ArrayList of type Integer. 
    The kth position in myFreqs should represent the number of times the kth word in myWords occurs in the file. 

 * 
 */
	private List<String> myWords;
	private List<Integer> myFreqs;
	
	// Write a constructor WordFrequencies, and initialize the private variables. 

	public WordCount(String path) {
		// TODO Auto-generated constructor stub
		 myWords=new ArrayList<>();
		 myFreqs=new ArrayList<>();
		 
		 try {
				text=textFileToString(path);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

   // Write a void method findUnique that has no parameters. 
	// This method should first clear both myWords and myFreqs, using the .clear() method. 
	// Then it selects a file and then iterates over every word in the file,
	// putting the unique words found into myWords.
	// For each word in the kth position of myWords, it puts the count of 
	// how many times that word occurs from the selected file into the kth position of myFreqs,
	// as was demonstrated in the lesson. 
	private String text;
	public void findUnique()
	{
		myFreqs.clear();
		myWords.clear();
		
		
		
		List<String> words=fromStringToList(text);
		
		
		
		
	   for(String word:words)
	   { 	
	    	 word.toLowerCase();
	    	int index=myWords.indexOf(word);
	    	if(index == -1)
	    	{
	    		myWords.add(word);
	    		myFreqs.add(1);
	    		  	}	
	    	else {
	    		
	    		int count=myFreqs.get(index);
	    		myFreqs.set(index, count+1);
	    	}
	    		
	    	//test
	    	
	    	
	    		
	    	
	    }
	    displayResults();
	    
	    	
		
	   
	}
	
	List<String> fromStringToList(String s) {
		StringTokenizer st=new StringTokenizer(s) ;
		List<String> l= new ArrayList<>();


		while(st.hasMoreTokens()) {

			l.add(st.nextToken());
		}
		return l;
	}

	private void displayResults() {
		for(String w:myWords) {
    		int i=myWords.indexOf(w);
    		System.out.println((i+1) +" "+ w +" "+ myFreqs.get(i));
    		
    		
    	}
		
	}

	public static void main(String[] args) throws Exception{
		WordCount wc= new WordCount("c:\\sharedData\\x.txt");
	
	   wc.findUnique();

	}
	String textFileToString(String path) throws Exception{
		StringBuilder sb=new StringBuilder();
		File f= new File(path);
		Reader r = null;
		try {
			
		
			
			r= new FileReader(f);
			int data=r.read();
			while(data!=-1) {
				//System.out.println(data);
				sb.append((char)data);
				 data=r.read();
				
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {r.close();}
		//System.out.println();
		return sb.toString();
	}
	
	
	
	
}
