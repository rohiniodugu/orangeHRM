package com.Arrayy3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax
		//List<data Type>arraylistName=newArrayList<>();
		//Arraylist1[0]=10;=new
		//ArrayList-collection of java
		//stringarray2[]=new String[2];//static structure with 2 indexs 
		//arrayList1[0]=10;
		List<Object>arrayList1=new  ArrayList<>();//WE have to import javapackages while we are writing this step
		//dynamic data structure with not indexs  ( index=storage)
		arrayList1.add(10);
		System.out.println(arrayList1.get(0));
		
		arrayList1.add("Loadrunner");
		System.out.println(arrayList1.get(1));
		
		arrayList1.add("10.123");
		System.out.println(arrayList1.get(2));
		
		arrayList1.add('B');
		System.out.println(arrayList1.get(3));
		
		
		//arrayList1.add(true);
		
		//for(int index=0;index<=2;index++)
		for(int index=0;index<arrayList1.size();index++)
		{
			System.out.println(arrayList1.get(index));
		}
		
	}

}
