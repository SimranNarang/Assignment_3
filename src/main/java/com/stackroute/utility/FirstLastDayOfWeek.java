package com.stackroute.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstLastDayOfWeek {
	public String getFirstDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(calendar.getTime());
		return dateFormat.format(calendar.getTime());
		
		
		
	}
	
	
	public String getLastDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(calendar.getTime());
		return dateFormat.format(calendar.getTime());
		
	}

}
