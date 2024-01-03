package com.inheritance;

public class Test2 extends Test1 {
 private void subtraction()
 {
	 int var1=20;
	 int var2=30;
	 int var3;
	 var3=var1-var2;
	 System.out.println("The value of the variable var3 after subtraction is "+var3);
 }
	public static void main(String[] args) {
		System.out.println("*************************Method of test1javaclass*********************");
		//Test1 t1=new Test1();
		//t1.addition();
		
		Test2 t2=new Test2();
		t2.subtraction();
		t2.multiplication ();
		System.out.println();
System.out.println("********method of Test1 javaclass********");
		//Test1 t1=new Test1();
				//t1.addition();
t2.addition();
System.out.println();
	}

	protected void multiplication()
	{
		int var1=20;
		int var2=30;
		int var3;
		var3=var1*var2;
		System.out.println("The value of the  variable  var3 after multiplication is"+var3);
	}
}

