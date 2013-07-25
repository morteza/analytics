/*******************************************************************************
 *        File: Layer.java
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jul 25, 2013
 *     Project: AnyTime Analytics - Prediction Toolkit
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/

package anytime.analytics.hmax;

import java.util.List;

public class Layer {
	int x;
	int y;
	int f;
	Box<Double> space;
	List<Double> data;
	  
	public Layer() {}
	
	public Layer computeLayer(Layer layer) {
		Layer result = layer;
		return result;
	}
	
	public void computeUnit(List<Layer> layers) {
		//Override
	}
	
	public Box<Double> getInputBoundBox(Layer layer) {
		//Override
		return null;
	}
}
