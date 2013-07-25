/*******************************************************************************
 *        File: Cell.java
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jul 25, 2013
 *     Project: AnyTime Analytics - Prediction Toolkit
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/

package anytime.analytics.prediction;

import java.util.List;

public class Cell {
	
	private List<Boolean> actives;
	private List<Boolean> learnings;
	private List<Boolean> predicteds;
	private Boolean output;
	private List<DistalDendriteSegment> distals;
	private List<Object> updates;
			
	public Cell() {
		
	}
	
	public Boolean isPredicted(int step) {
		return predicteds.get(step);
	}
	
	public Boolean isActive(int step) {
		return actives.get(step);
	}
	
	public Boolean isLearning(int step) {
		return learnings.get(step);
	}
	
	public void setPredicted(int step, boolean newValue) {
		predicteds.set(0, newValue);
	}
	
	public void setActive(boolean newValue) {
		actives.set(0, newValue);
	}
	
	public void setLearning(boolean newValue) {
		learnings.set(0, newValue);
	}
	
	public Boolean getOutput() {
		return output;
	}
	
	public void addSegment() {}
	
	public int getSegmentsCount() {
		return 0;
	}
	
	public void doStep() {}
	
}
