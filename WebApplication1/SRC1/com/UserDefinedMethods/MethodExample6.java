package com.UserDefinedMethods;

import userdefinedmethodexample2.MethodExample;

public class MethodExample6 {
	

	public static void main(String[] args) {
		
		MethodExample m2=new MethodExample();
		System.out.println("******************addition method of method example2 javaclass*********************");
		m2.addition();
		
		System.out.println("subtraction method cannot be called -because its a private method ");
		System.out.println();
		
		 MethodExample3 m3=new MethodExample3();
		 m3.multiplication();
			System.out.println("******************multiplication method  of  method example3 java class*********************");
			
			 MethodExample5 m5= new MethodExample5();
				m5.divisionByZero();
				System.out.println("****************************division by zero method of MethodExample5 java class***************");
				System.out.println();
				
				MethodExample4  m4=new MethodExample4();
				m4.division();
				System.out.println("************************division method of method Example4java class***************");
				System.out.println();
				
			

	}

}
