package menuo_2;

import java.util.Scanner;

public class Dviratis {

	public Dviratis(int speed) {

		speed = speed + 65;

	}
	
	String name;
	int speed;
	int speed1;
	int distance;
	int kmh;

	public void initInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite dviracio varda");
		name = input.nextLine();
		System.out.println("Koki dviratis greiti tures?");
		speed = input.nextInt();
		System.out.println("Koki dviratis atstuma nuvaziuoja?");
		distance = input.nextInt();
		kmh = distance * speed;
		System.out.println("Dviracio vidutinis greitis bus " + kmh + " kilometrai per valanda.");
		input.close();
	}
	
	public int getSpeed() {
		return speed;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public Dviratis() {

	}

	public Dviratis(String name) {

		System.out.println("My name is " + name);

	}

}