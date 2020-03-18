abstract public class Dyr {

    protected String AnimalType;
    protected String name;
    protected String SpecificBreed;
    protected String PrimaryBreed;
    protected String PrimaryColor;
    protected String DeSexed;
    protected String gender;
    protected  int Age;
    protected  String Locality;

    public Dyr(){

    }

    public Dyr( String AnimalType,String name,String SpecificBreed,String PrimaryBreed,String PrimaryColor,String DeSexed,String gender,int Age,String Locality){
        //AnimalType,Name,SpecificBreed,PrimaryBreed,PrimaryColour,De-sexed,Gender,Age,Locality
        this.AnimalType = AnimalType;
        this.name=name;
        this.SpecificBreed=SpecificBreed;
        this.PrimaryBreed= PrimaryBreed;
        this.PrimaryColor = PrimaryColor;
        this.DeSexed=DeSexed;
        this.gender = gender;
        this.Age=Age;
        this.Locality=Locality;
    }

    abstract void makeSound();



    public String getAnimalType() {
        return AnimalType;
    }

    public String getName() {
        return name;
    }

    public String getSpecificBreed() {
        return SpecificBreed;
    }

    public String getPrimaryBreed() {
        return PrimaryBreed;
    }

    public String getPrimaryColor() {
        return PrimaryColor;
    }

    public String getDeSexed() {
        return DeSexed;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return Age;
    }

    public String getLocality() {
        return Locality;
    }

    @Override
        public String toString() {
            return
                    ""+ AnimalType + '\'' +
                    "," + name + '\'' +
                    "," + SpecificBreed + '\'' +
                    "," + PrimaryBreed + '\'' +
                    "," + PrimaryColor + '\'' +
                    "," + DeSexed + '\'' +
                    "," + gender + '\'' +
                    "," + Age +
                    "," + Locality + '\'' +
                    '}';
    }




}
