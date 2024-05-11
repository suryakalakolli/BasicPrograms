package com.nt.basib;

public class ParticularCharcterPreInString {

	public static void main(String[] args) {
		
		String name ="kala";
		//a is present in string or not
		char c= 'a';
		int count=1;
		if(name.indexOf(c) == -1) {
			System.out.println("no character present in given string");
			System.exit(0);
			
		}
		else {
			for(int i = 0;i<name.length();i++) {
					if(name.charAt(i) == c) {
					name	= name.replaceFirst(String.valueOf(name.charAt(i)),String.valueOf(count) );
						count++;
					}
				}
			}
		System.out.println(name);
		}

	}


