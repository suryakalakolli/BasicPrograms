package com.nt.basib;

public class StudentExtend extends Student {
//to call non static methods in static only when call reference is creating
	//static method access only static variable
	// non static varaiable is accessed only instance members through ana object reference
public static void main(String[] args) {
	  new StudentExtend().test();
   }
   public void test() {
	   System.out.print(rollno);
   }
}
