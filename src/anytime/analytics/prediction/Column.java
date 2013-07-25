/*******************************************************************************
 *        File: Column.java
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jul 25, 2013
 *     Project: AnyTime Analytics - Prediction Toolkit
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package anytime.analytics.prediction;

import java.util.List;

public class Column {
	ProximalDendrite proximal;
	List<Cell> cells;
	List<Column> neighbors;
	int overlap;
	boolean active;
	int activeDutyCycle;
	int overlapDutyCycle;
	int boost;
	int scheduledUpdates;
}
