package com.UserDefinedMethods;
//global variables /instance  variables
public class MethodExample7 {
	int var1=50;
	int var2=40;
	
	public void addition()
	{
		// local variables 
		int var1=20;
		int var2=30;
		int var3;
		var3=var1+var2;
		System.out.println("the value of the  variable  after addition is" +var3);
	}
	
	public void addition(int var1,int var2)//it auser defined Method -method  with  parameters
	{
		//int var1=20;
		//int var2=30;
		int var3;
		var3=var1+var2;
		System.out.println("the value of the  variable  after addition is" +var3);
	}
	public void subtraction()
	{
		int var3;
		var3=var1-var2;
		System.out.println("the value of the  variable  after addition is" +var3);
		
}
	//method overloading ---method names same with different signatures
	public void addition(int var1,int var2, double var3)//it auser defined Method -method  with  parameters
	{
		//int var1=20;
		//int var2=30;
		//int var3;
		var3=var1+var2;
		System.out.println("the value of the  variable  after addition is" +var3);
	}  

	public static void main(String[] args) {
		MethodExample7  m7=new MethodExample7();
		m7.addition();
		m7.addition(90, 100);
		m7.addition(30, 90);
		m7.addition(90, 100, 50);
		System.out.println();
	}	
		
	}
	

