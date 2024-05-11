package com.nt.basib;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
  public static void main(String[] args) {
	  Boolean duplicate = false;
	  String s="kala";
	 char[] chs = s.toCharArray();
	 StringBuilder sb = new StringBuilder();
	 StringBuilder sb1 = new StringBuilder();
	 StringBuilder sb2= new StringBuilder();
	 StringBuilder sb3= new StringBuilder();
	 s.chars().distinct().forEach(org->
	  sb.append((char)org)); 
	 System.out.println(sb);
  
  for(int i=0;i<chs.length;i++) {
	  for(int j=i+1;j<chs.length;j++) {
		  if(chs[i]==chs[j]) {
			  duplicate = true;
			  break;
		  }	 
	  }
	  if(!duplicate) {
		  sb1.append(chs[i]);
	  }
	 
  }
  System.out.println(sb1); 
  
  
  for(int i=0;i<s.length();i++) {
	 int id=s.indexOf(s.charAt(i), i+1);
	if(id==-1) {
		  sb2.append(s.charAt(i));
	  }
  }
  System.out.println(sb2); 
  
  
  
 
  Set<Character> set = new LinkedHashSet<Character>();
  for(int i=0;i<s.length();i++) {
	  set.add(s.charAt(i));
  }
	  
  System.out.println(set);
  
  for(Character a:set) {
	  sb3.append(a);
  }
  
  System.out.println(sb3);
  
  }
}
