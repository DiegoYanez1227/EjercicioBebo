package Arrays.lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		int suma=0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("escribe un numero");
			int num=sc.nextInt();
			array[i]=num;
			suma+=array[i];

		}
		System.out.println(Arrays.toString(array));
		System.out.println(suma);
	}

}
