package com.stackroute.utility;

public class ConsecutiveChecker {
	boolean isConsecutive(String string) 
    {	
		String splitedString[] = string.trim().split(",");
		if(splitedString.length!=7) return false; //to check 7 consecutive number
        
		int arr[] = converter(splitedString);
        /* 1) Get the minimum element in array */
        int min = getMin(arr);
 
        /* 2) Get the maximum element in array */
        int max = getMax(arr);
 
        /* 3) max - min + 1 is equal to n,  then only check all elements */
        if (max - min + 1 == 7) 
        {
            
            boolean visited[] = new boolean[7];
            
            for (int i = 0; i < 7; i++) 
            {
                /* If we see an element again, then return false */
                if (visited[arr[i] - min] != false)
                    return false;
                /* If visited first time, then mark the element as visited */
                visited[arr[i] - min] = true;
            }
            /* If all elements occur once, then return true */
            return true;
        }
        return false; // if (max - min  + 1 != n)
    }
 
    int[] converter(String[] string) {
    	int arr[]= new int[7];
    	for(int i=0;i<7;i++) {
    		try {
    			arr[i]=Integer.parseInt(string[i]);
    		} catch(Exception e) {
    			throw new IllegalArgumentException("only numbers are allowed");
    		}
    	}
    	return arr;
		
	}

	/* UTILITY FUNCTIONS */
    int getMin(int arr[]) 
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
 
    int getMax(int arr[]) 
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }


}
