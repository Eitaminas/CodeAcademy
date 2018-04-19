package menuo_1;

import java.util.Scanner;

public class Pamoka4 {

	public static void main2(String[] args) {
		//2018-03-20
		
		
//		int[] x = new int[5];
//		x[0] =  4;
//		x[1] = 7;
//		x[2] = x[0]*x[1];
//		
//		
//		if ( (x[2] & 1) == 0 ) {
//			
//			
//			x[3] = 0;
//			
//			
//		}else {
//			
//			
//			x[3] = 1;
//			
//			
//		}
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[3]);
//		System.out.println(x[4]);
		
		
		
		int SteveMasë = 0;
		int blokas = 7874;
		//a
		
		int ingotas = blokas/9;
		
		//b
		Boolean taip = true;
		Boolean ne = false;
		Boolean turisarvus;
		
		
		System.out.println("Ar Steve turi ðarvus?");
		System.out.println("Galima atsakyti: taip arba ne");
		
		Scanner input = new Scanner(System.in);
		turisarvus = input.nextBoolean();
		input.close();
		
		if(turisarvus) {
			
			SteveMasë = SteveMasë + 24;
			
		}
		
		System.out.println(turisarvus);
		
		
		

		
		
		
	}
}