package les15.packZooclub;

public class Animal {
	private String animalType;
	private String animalName;
	
	public Animal(String animalType, String animalName) {
		this.animalType = animalType;
		this.animalName = animalName;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", animalName=" + animalName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal))
			return false;
		Animal a = (Animal)obj;
		return (this.animalName.equals(a.animalName) && this.animalType.equals(a.animalType));
	}

	@Override
	public int hashCode() {
		int result = 12;
		result = 37 * result + animalName.hashCode();
		result = 37 * result + animalType.hashCode();
		return result;
	}
	
	
}
