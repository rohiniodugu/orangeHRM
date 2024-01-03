package com.arrays;

public class Mutidimentionalarray {

	public static void main(String[] args) {
		
		//syntax
		//data Type arrayName[][]=newdatatype[size][size];
		//[]row []-Row of cell
		String array1[][]=new String[2][2];
		array1[0][0]="venkat";
		
		array1[0][1]="manualtesting";
		
		
		array1[1][0]="srini";

		/*array1[1][1]="selenium";
		System.out.println([0][0]);
		System.out.println([0][1]);
		System.out.println([1][0]);
		System.out.println([1][1]);*/
	//going to the  row of the array1
		for(int rowindex=0;rowindex<=1;rowindex++)
		{
		//going to row internally going to all its  respective cells
			for(int cellindex=0;cellindex<=1;cellindex++)
			{
				
			
			System.out.println(array1[rowindex][cellindex]+""+"");
			}
		}System.out.println();
	}
	}

		// TODO Auto-generated method stub

	


