package Arrays.lista2;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		int suma=0;

		// relleno el array 
		for (int i = 0; i < array.length; i++) {
			System.out.println("escribe un numero");
			int num=sc.nextInt();
			array[i]=num;
		}

		// mayor y menor 
		int mayor=0;
		int menor=array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i]>mayor) {
				mayor=array[i];
				

			}else if(array[i]<menor) {
				menor=array[i];
				
			}

		}
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);
	}

}
