package com.deloitte.main;

public class Triplets {
	static boolean searchTrip( int arr[])
	 {
	  for (int i=0;i<arr.length-2;i++) {
	   if (arr[i]==arr[i+1] && arr[i+1]==arr[i+2])
	   {
	     return true;
	   }
	  }
	  return false;
}
}