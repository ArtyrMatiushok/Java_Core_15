package les15.packZooclub;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menu;
		Zooclub zooclub = new Zooclub();
		while (true) {
			System.out.println("1 - to add a person to club");
			System.out.println("2 - to add a animal to person");
			System.out.println("3 - to remove a animal from the club member");
			System.out.println("4 - to remove a person from the club");
			System.out.println("5 - to remove the animal from the club");
			System.out.println("6 - to show all zoo club");
			System.out.println("7 - to exit from program");
			menu = in.nextInt();
			in.nextLine();
			switch(menu) {
			case 1:
				zooclub.addPersonToClub();
				break;
			case 2:
				zooclub.addAnimalToPerson();
				break;
			case 3:
				zooclub.removeAnimalFromPerson();
				break;
			case 4:
				zooclub.removePerson();
				break;
			case 5:
				zooclub.removeAnimalFromAllPersons();
				break;
			case 6:
				zooclub.show();
				break;
			case 7:
				System.exit(0);
				break;
			}
		}
	}

}
