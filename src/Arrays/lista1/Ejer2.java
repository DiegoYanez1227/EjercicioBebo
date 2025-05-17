package Arrays.lista1;

public class Ejer2 {
	public static void main(String[] args) {
		
		int array2[]=new int [20];
		int num=20;
		
		
		for (int i = 0; i < array2.length; i++) {
			array2[i]=num--;
			System.out.println(array2[i]);
			
		}
	}

}
