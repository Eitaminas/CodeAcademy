package menuo_1;

import java.util.Scanner;

public class Pamoka5 {

	public static void main3(String[] args) {
		// 2018-03-22

		// Pirmoji uzduotis:

		// System.out.println("Iveskite skaiciu:");
		//
		// Scanner input = new Scanner(System.in);
		// int skaicius1 = input.nextInt();
		//
		//
		// System.out.println("Iveskite kita skaiciu:");
		//
		// int skaicius2 = input.nextInt();
		// input.close();
		//
		// System.out.println("atsakymas:");
		//
		// System.out.println(skaicius1*skaicius2);

		// Pirmoji uzduotis baigiasi.

		// Trecioji uzduotis:

		int SteveMasë = 0;
		int blokas = 7874;

		// a

		int ingotas = blokas / 9;

		// b
		Boolean taip = true;
		Boolean ne = false;
		String turisarvus;

		System.out.println("Ar Steve turi ðarvus?");
		System.out.println("Galima atsakyti: taip arba ne");

		Scanner input = new Scanner(System.in);
		turisarvus = input.next();

		if ( turisarvus.equalsIgnoreCase("Taip") ) {

			SteveMasë = SteveMasë + 24;

		}

		// c
		
		int kiekgeleziesbloku;
		System.out.println("Kiek iron bloku turi steve?");
		Scanner input1 = new Scanner(System.in);
		float ironblokai123 = input.nextFloat();
		
		
		
		int kiekgeleziesingotu;
		System.out.println("Kiek iron ingot turi steve?");
		Scanner input2 = new Scanner(System.in);
		int ironingotai123 = input.nextInt();
		
		
		
		
		
		System.out.println("Vienas geleþies ingotas kilogramais yra:");
		
		System.out.print(blokas / 9);
		
		System.out.println(" kilogram ai/ø");
		
		System.out.println("geleþies ðarvai kilogramais yra:");
		
		System.out.print(blokas / 9*24);
		
		System.out.println(" kilogram ai/ø");

		System.out.println();
		
		
		System.out.println(ironblokai123/9+SteveMasë+ironingotai123);
		
	}
}