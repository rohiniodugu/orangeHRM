package com.UserDefinedMethods;

public class MethodExample5 {/*
void sionByZero() {//default method
		int var1=40;
		int var2=0;
		int var3;
		var3=var1/var2;
		System.out.println("the value of the variable var3 after division is:-"+var3);
		
	}*/
	void divisionByZero() {//default method
		try
		{
		int var1=40;
		int var2=0;
		int var3;
		var3=var1/var2;
		System.out.println("the value of the variable var3 after division is:-"+var3);
		}
		catch(Exception exceptioncaught)
		{
			System.out.println("unable to perform the  operation of division method the  exception caught"+exceptioncaught);
		}
	}
	public static void main(String[] args) {
		System.out.println();
		System.out.println("****************the divisionmethod of method example4************************");
		
		MethodExample4  m4=new MethodExample4();
		m4.division();
		 MethodExample5 m5= new MethodExample5();
		 
	m5.divisionByZero();
	}

}
