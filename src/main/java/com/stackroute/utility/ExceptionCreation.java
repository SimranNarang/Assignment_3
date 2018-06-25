package com.stackroute.utility;

public class ExceptionCreation {
	public void firstException() {
		/*try {
		*/	throw new NegativeArraySizeException("Error one"); 
		/*}catch(NegativeArraySizeException error) {
			System.out.println(error.getMessage());
		}*/
	}
	
	public void secondException() {
		/*try {
		*/	throw new IndexOutOfBoundsException("Error two"); 
		/*}catch(IndexOutOfBoundsException error) {
			System.out.println(error.getMessage());
		}*/
	}
	
	public void thirdException() {
		/*try {
		*/	throw new NullPointerException("Error three"); 
		/*}catch(NullPointerException error) {
			System.out.println(error.getMessage());
		}*/
	}

}
