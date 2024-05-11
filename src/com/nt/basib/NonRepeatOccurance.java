package com.nt.basib;
import java.util.*;
import java.util.Map.Entry;
public class NonRepeatOccurance {
 public static void main (String args[]) {
	 String name = "kala";
	char [] ch = name.toCharArray();
	Boolean nrc = false;
	 Map<Character,Integer> ml = new HashMap<>();
	 for(char c:ch) {
		 if(!ml.containsKey(c)) {
			 ml.put(c, 1);
			 nrc = true;
		 }
		 
		 else {
			int value = ml.get(c);
			value++;
			ml.put(c,value);
		 }
		 
	 }
	 
	 for(Entry<Character,Integer> en : ml.entrySet()) {
		if(en.getValue() == 1) {
			System.out.println(en.getKey()+" ");
		}
	 }
	 System.out.print(ml);	 
 }
}
