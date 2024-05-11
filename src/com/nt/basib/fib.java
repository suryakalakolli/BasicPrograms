package com.nt.basib;

public class fib {
public static void main(String args[]) {
	int fact =1;
	int n=121;
	int temp =n;
	int r = 0;
	int b=0;
	for(int i=1;i<=n;i++) {
		fact = fact*i;
	}
	
	System.out.print(fact);
	while(n!=0) {
		int a=n%10;
		 r=r*10+a;
		 n=n/10;
		 b=b+a*a*a;
	}
	System.out.println(r);
	System.out.println(b+"armstrong");

if(temp == r) {
	System.out.println("rev");
}
}
}