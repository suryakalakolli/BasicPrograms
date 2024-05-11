package com.nt.basib;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean prime = true ;
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		s.close();
		System.out.println("Enter the num" +n);
		for(int i =2 ;i<=n/2;i++) {
			int temp =n%i;
			if(temp ==0 ) {
				prime = false;
				break;
			}
		}
		
		if(prime) {
			System.out.println("is a prime");
		}
		else
			System.out.println("not a prime number");
	
int a =0,b=0,c=1;

for(int i=0;i<=n;i++) {
	a=b;
	b=c;
	c=a+b;
	System.out.print(a);
}

}
}