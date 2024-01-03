package com.inheritance;

public class Test3  extends Test2 {
	 void  division()
	 {
		 int var1=20;
		 int var2=5;
		 int var3;
		 var3=var1/var2;
		 System.out.println("the value of the  variable va3 after division is " +var3);
		 
	 }

	public static void main(String[] args) {
		System.out.println("**********method of Test3 javaclass ********");

Test3 t3=new Test3();
t3.division();
System.out.println();
 System.out.println("***********************method of Test2 javaclass*******");
 System.out.println(" Test2 java class user-defined method  which  is private  cannot be accesed in the  current class");
 t3.multiplication();// protected
 System.out.println();
 System.out.println("****method of Test1 java class********");
 //Test1 t1=new Test();
 //t1.addition();
 //t3.addition();
 System.out.println();
 
 
	}

}
