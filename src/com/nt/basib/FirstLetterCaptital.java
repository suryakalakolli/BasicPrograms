package com.nt.basib;

public class FirstLetterCaptital {
	
	public static void main(String args[]) {
		String s="kala";
		char [] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i==0 && c[i]!= ' '||c[i-1]== ' ' && c[i]!=' '){
							
			if(c[i]>='a'&& c[i]<='z') {
				c[i] =(char) (c[i]-'a'+'A');
				
			}
			}
		}
		//subString
			String st = new String(c);
			System.out.println(st);
			String[] sp=s.split(" ");
			for(String a:sp) {
			String u = a.substring(0,1).toUpperCase();
			StringBuffer sb =new StringBuffer();
			sb.append(u);
			sb.append(st.substring(1));
				System.out.print(sb);
			}
		}
	
	

}
