package Arrays.lista2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int array[]=new int[20];
			
			int suma=0;
			int media=0;
			
			for (int i = 0; i < array.length; i++) {
				System.out.println("escribe un numero");
				int num=sc.nextInt();
				array[i]=num;
				suma+=array[i];
				media=suma/array.length;
				
			}
			System.out.println(media);
	}

}
