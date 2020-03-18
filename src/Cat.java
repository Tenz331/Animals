public class Cat extends Dyr {
    public Cat(String AnimalType, String name, String SpecificBreed, String PrimaryBreed, String PrimaryColor, String DeSexed, String gender, int Age, String Locality) {
        super(AnimalType, name, SpecificBreed, PrimaryBreed, PrimaryColor, DeSexed, gender, Age, Locality);
    }

    @Override
    void makeSound() {
        System.out.println("Miaw");
    }

}

