package com.nt.basib;
import java.util.*;
public class NumberOfCharacters {

	public static void main(String[] args) {
		String s="kala";
		int count = 0;
		boolean cnt = false;
		char[] ch = s.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;i<s.length();i++) {
				if(ch[i] == ch[j]) {
					count++;
					cnt = true;	
				}
				map.put(ch[i], count);		
			}
			if(cnt) {
				count =0;
			}
			
		}
		System.out.println(map);
	}

}
