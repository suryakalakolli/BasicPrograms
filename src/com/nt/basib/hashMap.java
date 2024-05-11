package com.nt.basib;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMap {
	public static void main(String args[]) {
		String s = "This this is is done by Saket Saket";
	HashMap<String,Integer> hm =new HashMap<String,Integer>();
	String[] st = s.split(" ");

	for(int i=0;i<st.length;i++) {
//		if(hm.containsKey(st[i])) {
//		int cnt 	=hm.get(st[i]);
//			hm.put(st[i],cnt+1);
//		}
//		else {
//			hm.put(st[i],1);
//		}
		hm.put(st[i], i);
		
	}
	System.out.println(hm);
	Iterator it = hm.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry map =(Map.Entry)it.next();
		System.out.println(map.getKey()+""+map.getValue());
	}
	
}
	
}


        
