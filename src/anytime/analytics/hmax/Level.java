/*******************************************************************************
 *        File: Level.java
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jul 25, 2013
 *     Project: AnyTime Analytics - Prediction Toolkit
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/

package anytime.analytics.hmax;

import java.util.List;

public class Level {
	public String name;
	public Filter filter;
	private Network network;
	private int index;
	List<Layer> layers;
}
