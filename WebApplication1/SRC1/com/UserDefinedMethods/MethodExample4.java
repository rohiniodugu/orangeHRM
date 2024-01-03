package com.UserDefinedMethods;

public class MethodExample4 {
	
	protected void division() 
	{
	int var1=40;
	int var2=20;
	int  var3;
	var3=var1/var2;
	System.out.println(" the value of the variable var3 is  after didvision is"+var3);
	 
	}
	
	

	public static void main(String[] args) {
		
		MethodExample4  m4=new MethodExample4();
		m4.division();
	}

}
