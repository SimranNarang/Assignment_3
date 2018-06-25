package com.stackroute.utility;

public class ExceptionCreation {
	public String firstException() {
		try {
			int a[]= new int[-20]; 
		}catch(NegativeArraySizeException error) {
			System.out.println(error.toString());
			return error.getClass().getName();
		}
		return null;
	}
	
	public String secondException() {
		try {
			int a[] = new int[5];
			a[6]=10;
		}catch(IndexOutOfBoundsException error) {
			return error.getClass().getName();
		}
		return null;
	}
	
	public String thirdException() {
		try {
			String str = null;
			str.length();
		}catch(NullPointerException error) {
			return error.getClass().getName();
		}
		return null;
	}

}
