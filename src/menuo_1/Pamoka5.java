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

		int SteveMas� = 0;
		int blokas = 7874;

		// a

		int ingotas = blokas / 9;

		// b
		Boolean taip = true;
		Boolean ne = false;
		String turisarvus;

		System.out.println("Ar Steve turi �arvus?");
		System.out.println("Galima atsakyti: taip arba ne");

		Scanner input = new Scanner(System.in);
		turisarvus = input.next();

		if ( turisarvus.equalsIgnoreCase("Taip") ) {

			SteveMas� = SteveMas� + 24;

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
		
		
		
		
		
		System.out.println("Vienas gele�ies ingotas kilogramais yra:");
		
		System.out.print(blokas / 9);
		
		System.out.println(" kilogram ai/�");
		
		System.out.println("gele�ies �arvai kilogramais yra:");
		
		System.out.print(blokas / 9*24);
		
		System.out.println(" kilogram ai/�");

		System.out.println();
		
		
		System.out.println(ironblokai123/9+SteveMas�+ironingotai123);
		
	}
}