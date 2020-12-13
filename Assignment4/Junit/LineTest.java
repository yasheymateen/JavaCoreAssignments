package com.ss.assignment4.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {

	@Test
	public void getSlopeTest() {
		Line line1 = new Line(2,3,4,6);
		assertEquals(1.5, line1.getSlope(), .1);
	}
	
	@Test
	public void getDistanceTest() {
		Line line2 = new Line(2,3,4,6);
		assertEquals(3.605551275463989, line2.getDistance(), .0001);
	}
	
	@Test
	public void parallelToTest() {
		Line line1 = new Line(2,3,4,6);
		Line line3 = new Line(4,6,8,12);
		assertEquals(true, line1.parallelTo(line3));
	}
	
}

