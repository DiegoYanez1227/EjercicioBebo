package Arrays.lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[20];
		
		int sumapos=0;
		int sumaneg=0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("escribe un numero");
			int num=sc.nextInt();
			array[i]=num;
			if (num>=0) {
				sumapos+=array[i];
				
			}
			else {
				sumaneg+=array[i];
			}
			
		}
		System.out.println("la suma de los positivos es "+sumapos);
		System.out.println("la suma de los negativos es "+sumaneg);

		
		
	}

}
