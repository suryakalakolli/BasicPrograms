package com.nt.basib;

import java.util.Arrays;

public class Duplicate {
	public static void main(String args[]) {
	String s ="kalal";
	int index=0;
		char[] c =s.toCharArray();
//	for(int i=0 ;i<s.length();i++) {
//		
//		for(j=0;j<i;j++) {
//				
//			if(c[i]==c[j]) {
//				System.out.print(c[j]);
//				break;
//			}
//		}
//			if(i==j) {
//			  c[index++] =c[i];
//			}
//			
//	
//	}
		StringBuilder sb = new StringBuilder();
	 for(int i=0;i<c.length;i++) {
		 Boolean duplicate = false;
		  for(int j =i+1;j <c.length;j++) {
			  if(c[i]==c[j]) {
				  System.out.print(c[j]);
				  duplicate = true;
				  break;
			  }	 
		  }
		  if(!duplicate) {
			  sb.append(c[i]);
		  }
		 
	  }
	  System.out.println(" "+sb); 
}
}