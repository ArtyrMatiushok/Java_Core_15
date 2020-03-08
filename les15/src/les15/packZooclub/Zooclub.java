package les15.packZooclub;

import java.util.*;
import java.util.Map.Entry;

public class Zooclub {
	private Map<Person, List<Animal>> map = new HashMap<Person, List<Animal>>();
	
	public void addPersonToClub() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter person name: ");
		String name = in.nextLine();
		System.out.print("Enter person age: ");
		int age = in.nextInt();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		map.put(new Person(name, age), animals);
		show();
	}
	
	public void addAnimalToPerson() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter person name: ");
		String name = in.nextLine();
		Iterator<Entry<Person, List<Animal>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Person, List<Animal>> item = it.next();
			if (item.getKey().getName().equals(name)) {
				
				System.out.print("Enter animal type: ");
				String aType = in.nextLine();
				System.out.print("Enter animal name: ");
				String aName = in.nextLine();
				item.getValue().add(new Animal(aType, aName));
				break;
			}
		}
		show();
	}
	
	public void removeAnimalFromPerson() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter person name: ");
		String name = in.nextLine();
		Iterator<Entry<Person, List<Animal>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Person, List<Animal>> item = it.next();
			if (item.getKey().getName().equals(name)) {
				System.out.println("Enter animal name: ");
				String aName = in.nextLine();
				Iterator<Animal> aIt = item.getValue().iterator();
				while (aIt.hasNext()) {
					if (aIt.next().getAnimalName().equals(aName)) {
						aIt.remove();
						break;
					}
				}
				break;
			}
		}
		show();
	}
	
	public void removePerson() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter person name: ");
		String name = in.nextLine();
		Iterator<Entry<Person, List<Animal>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			if (it.next().getKey().getName().equals(name)) {
				it.remove();
				break;
			}
		}
		show();
	}
	
	public void removeAnimalFromAllPersons() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter animal type: ");
		String aType = in.nextLine();
		Iterator<Entry<Person, List<Animal>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Iterator<Animal> aIt = it.next().getValue().iterator();
			while (aIt.hasNext())
				if (aIt.next().getAnimalType().equals(aType)) {
					aIt.remove();
					break;
				}
		}
		show();
	}
	
	
	
	public void show() {
		for (Entry<Person, List<Animal>> e : map.entrySet()) {
			System.out.println(e.getKey() + " has:");
			System.out.println(e.getValue());
		}
	}
}
