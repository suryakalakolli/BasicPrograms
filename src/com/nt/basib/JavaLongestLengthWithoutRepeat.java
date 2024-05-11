package com.nt.basib;
import java.util.*;
public class JavaLongestLengthWithoutRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="java";
		char[] ch = s.toCharArray();
		int largeStringLen =0;
		String larStringCon ="";
		Map<Character,Integer> ml = new HashMap<>();
		for(int i=0;i<s.length();i++) {
	    if(!ml.containsKey(ch[i])) {
	    	ml.put(ch[i], i);
	    }
	    else {
	    	ml.get(ch[i]);
	    	ml.clear();
	    }
	    
	    if(ml.size()>largeStringLen ) {
	    	largeStringLen = ml.size();
	    	larStringCon = ml.keySet().toString();
	    }
	    System.out.println(larStringCon.toString());
		}
	}

}
