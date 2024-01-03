package com.arrays;

public class Objectarrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax
				//Object array1[]=new Object[size];
				//Object array1[][]=new Object[size][size];
				//Object array is capable of storing different  datatype values
				//Object array must and should be declared with  the size 
				Object array1[]=new Object[3];
				array1[0]=10;
			System.out.println(array1[0]);
			
			
			array1[1]="WebDriver";// string datatype
			System.out.println(array1[1]);
				


			array1[2]='A'; //char datatype
			System.out.println(array1[2]);	
			for(int rowindex=0;rowindex<=2;rowindex++) {
				System.out.println(array1[rowindex]); 
			}
				
			}

		}

	


