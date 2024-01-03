package com.UserDefinedMethods;

import userdefinedmethodexample2.MethodExample;

public class MethodExample3 {
public void multiplication()
{
	
int var1=20;
int var2=30;
int var3;
var3=var1*var2;
System.out.println(" the value of the variable after multiplication is"+var3);

}
	

	public static void main(String[] args) {
		
		 MethodExample3 m3=new MethodExample3();
		 m3.multiplication();
		 System.out.println();
		 System.out.println("*******************additionmethod of methodExample2class***********");
		//3.addition();
		 
	
	MethodExample mm2=new MethodExample();
	mm2.addition();
	System.out.println();
	}
}
