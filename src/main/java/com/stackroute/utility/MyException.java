package com.stackroute.utility;

public class MyException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public MyException(String msg) {
		this.msg = msg;
    } 
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static void main(String[] args) {
		try {
			throw new MyException("my new exception created");
		}catch(MyException e) {
			System.out.println(e.getMsg());
		}
		finally {
			System.out.println("finally block executed");
		}
	}
}
