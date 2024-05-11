package com.nt.basib;

public class ReverseString {
	public static void main(String args[]) {
	String s ="kala";
	String name = "surya kala";
	String[] n = name.split(" ");
	String rev  ;
	char[] c = s.toCharArray();
	StringBuilder sb = new StringBuilder();
	StringBuilder sb1 = new StringBuilder();
	for(int i= s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i)+"");
	sb.append(c[i]);
	}
	System.out.println(sb);
	for(String a:n) {
		for(int i=a.length()-1;i>=0;i--) {
			sb1.append(a.charAt(i)+" ");
					}
	}
	System.out.println(sb1);
}
}
