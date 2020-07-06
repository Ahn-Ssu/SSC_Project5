package edu.handong.csee.java;

public class Justice {

	private static Justice instance; 
	
	private int count ;
	private boolean doStart;
	
	public Justice() {
		count = 0 ;
	}

	public static Justice getInstance() {
		if(instance == null)
			instance = new Justice();
		
		return instance;
	}

	public int getCount() {
		if(doStart)
			return count++;
		else
			return count;
	}

	public void setDoStart(boolean doStart) {
		this.doStart = doStart;
	}

	public boolean isDoStart() {
		return doStart;
	}

	
}
