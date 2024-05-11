package com.nt.basib;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lar =0,sec =0;
		int [] a = {2,9,8,5,7,3,6};
		for(int i=0;i<a.length;i++) {
			if(a[i]>lar) {
				sec =lar;
				lar=a[i] ;
						
			}
			else if(a[i]>sec) {
				sec =a[i];
			}
				
		}
		System.out.print(sec);
		System.out.print(lar);

	}

}
