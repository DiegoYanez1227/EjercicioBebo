package Arrays.lista1;

import java.util.Iterator;

public class Ejer1 {
	 public static void main(String[] args) {
		
		 int numeros[]=new int[10];
		 int num=100;
		 
		 for (int i = 0; i < numeros.length; i++) {
			 numeros[i]=num++;
			 System.out.println(numeros[i]);
			 
			
		}
	}

}
