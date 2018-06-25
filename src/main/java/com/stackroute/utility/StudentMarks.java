package com.stackroute.utility;

public class StudentMarks {
	public char[] gradeStudents(int marks[]) {
		char grades[] = new char[marks.length];
		for(int i=0;i<marks.length;i++) {
			
			if(marks[i]<0||marks[i]>100)
				throw new IllegalArgumentException("Invalid Marks");
			
			if(marks[i]>=80)
				grades[i]='A';
			else if(marks[i]>=60)
				grades[i]='B';
			else if(marks[i]>=45)
				grades[i]='C';
			else
				grades[i]='F';
		}
		return grades;
	}
}
