package Arrays.lista1;

public class Ejer5 {
	public static void main(String[] args) {
		int array2[]=new int [20];
		int num=20;


		for (int i = 0; i < array2.length; i++) {
			array2[i]=num--;
			System.out.println(array2[i]);

		}
		System.out.println("-------------------------------------------------------------------------------------------");

		for (int i = 0; i < array2.length; i++) {
			if (i>5 && i<9) {
				array2[i]=99;
				
			}
			System.out.println(array2[i]);

			}
		}
	}


