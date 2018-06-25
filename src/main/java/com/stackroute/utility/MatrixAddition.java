package com.stackroute.utility;

public class MatrixAddition {
	
	public int[][] additionFunction(int[][] matrixA,int[][] matrixB){
		
		if(matrixA.length!=matrixB.length || matrixA[0].length!=matrixB[0].length)
			throw new IllegalArgumentException("Matrix size should be same for addition!");
		
		int[][] matrixC = new int[matrixA.length][matrixA[0].length];
		for(int i=0;i< matrixA.length ;i++) {
			for(int j=0;j<matrixA[0].length;j++) {
				matrixC[i][j]= matrixA[i][j]+matrixB[i][j];
			}
		}
		return matrixC;
	}
}
