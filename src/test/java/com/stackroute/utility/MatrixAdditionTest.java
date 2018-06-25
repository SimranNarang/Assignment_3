package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrixAdditionTest {

	MatrixAddition add;
	int[][] mat1;
	int[][] mat2;
	
	@Before
	public void setup() {
		 mat1= new int[][]{{1,2},{3,4},{5,6}};
		 mat2= new int[][]{{9,8},{7,6},{5,4}};
		 add=new MatrixAddition();
	}
	@Test(expected=IllegalArgumentException.class)
	public void inputSizeMatrixCheck() {
		int[][] mat1={{1,2,5},{3,4},{5,6}};
		int[][] mat2={{1,2},{3,4},{5,6},{2,4}};
		add.additionFunction(mat1, mat2);
	}
	@Test
	public void additionTest() {
		int[][] expectedMatrix={{10,10},{10,10},{10,10}};
		
		assertArrayEquals(expectedMatrix,add.additionFunction(mat1, mat2));
	}
	

}
