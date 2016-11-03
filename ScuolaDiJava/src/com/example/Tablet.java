/**
 * 
 */
package com.example;

/**
 * @author us01621
 *
 */
public class Tablet {

	/**
	 * 
	 */
	
	private int weight;
	private float screenSize;
	private boolean wifiOnly;
	public Tablet() {
		// TODO Auto-generated constructor stub
		this.weight=0;
		this.screenSize=0L;
		this.wifiOnly=false;		
	}	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public float getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}

	public boolean isWifiOnly() {
		return wifiOnly;
	}

	public void setWifiOnly(boolean wifiOnly) {
		this.wifiOnly = wifiOnly;
	}



}
