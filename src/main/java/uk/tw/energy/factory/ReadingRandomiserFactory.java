package uk.tw.energy.factory;

import java.util.Random;

public class ReadingRandomiserFactory {
	
	private ReadingRandomiserFactory(){}
	
	private static Random readingRandomiser; 
	
    public static Random getReadingRandomiser() {
    	if(readingRandomiser ==null)
    	{
    		readingRandomiser = new Random();
    	}
		return readingRandomiser;
	}
}
