package edu.handong.csee.java;

public class Justice {

	private static Justice instance; 
	
	private int count ;
	
	
	public Justice() {
		count = 0 ;
	}

	public static Justice getInstance() {
		if(instance == null)
			instance = new Justice();
		
		return instance;
	}

	public int getCount() {
		return count++;
	}

	
}
