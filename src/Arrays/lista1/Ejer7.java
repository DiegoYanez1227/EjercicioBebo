package Arrays.lista1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejer7 {
	public static void main(String[] args) {


		int array3[]=new int [30];

		int array1[]=new int[10];
		int num1=100;

		int array2[]=new int [20];
		int num2=20;

		// array 1
		for (int i = 0; i < array1.length; i++) {
			array1[i]=num1++;
			System.out.println(array1[i]);


		}
		// array 2
		for (int i = 0; i < array2.length; i++) {
			array2[i]=num2--;
			System.out.println(array2[i]);

		}

		// meto el array1 en el 3 
		for (int i = 0; i < array1.length; i++) {
			array3[i]=array1[i];

		}

		// meto el array2 en el 3 
		for (int i = 0; i < array2.length; i++) {
			array3[i+array1.length]=array2[i];
		}			

		for (int i = 0; i < array1.length; i++) {
			array1[i]=num1++;

			if(i>=6&& i<=7) {
				num1=99;
			}
		}
		
		for (int i = 0; i < array2.length; i++) {
			array2[i]=num2--;
			if (i>5 && i<9) {
				num2=99;
				
			}
		}
		System.out.println("Array1: "+Arrays.toString(array1));
		System.out.println("Array2: "+Arrays.toString(array2));
		System.out.println("array3: "+Arrays.toString(array3));
		
		
	}

}
