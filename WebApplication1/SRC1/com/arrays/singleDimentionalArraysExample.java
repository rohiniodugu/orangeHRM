package com.arrays;

public class singleDimentionalArraysExample {

	private static int index;

	public static void main(String[] args) {
		
int srini[]=new int[3];

srini[0]=25;
//System.out.println(srini[0]);
srini[0]=35;
srini[1]=50;
srini[2]=60;
/*
System.out.println(srini[0]);
System.out.println(srini[1]);
System.out.println(srini[2]);
*/

/*srini[2]=60;

System.out.println(srini[2]);

srini[3]=0;
System.out.println(srini[3]);*/
//for(int index=0;index<=2;index++)
	for(int index1=0;index1<srini.length;index1++)
	{
		//System.out.println(srini[0]);
	
		System.out.println(srini[index]);
	}
		System.out.println();
	System.out.println("####################################");
System.out.println();

for(int index=0;index<=2;index++)
{
	//System.out.println(srini[0]);
	System.out.println(srini[index]);
}

	}

}
