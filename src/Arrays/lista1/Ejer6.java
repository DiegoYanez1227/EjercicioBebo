package Arrays.lista1;

public class Ejer6 {
	public static void main(String[] args) {
		
	 int array1[]=new int[10];
	 int num=100;
	 
	 for (int i = 0; i < array1.length; i++) {
		 array1[i]=num++;
		 
		
	}int array2[]=new int [20];
	int num2=20;
	
	
	for (int i = 0; i < array2.length; i++) {
		array2[i]=num2--;
		
	}
	
	for (int i = 0; i < array1.length; i++) {
		if (i>=2&&i<7) {
			array1[i]=array2[i-2];
			
		}
		System.out.println(array1[i]);
		
	}
}
}
