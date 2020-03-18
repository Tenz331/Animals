import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//AnimalType,Name,SpecificBreed,PrimaryBreed,PrimaryColour,De-sexed,Gender,Age,Locality

public class ImportDyr {

    public void importAnimals(Bur bur) throws FileNotFoundException {
        String AnimalFile = "Data/Animals.csv";
        File file = new File(AnimalFile);

        if(file.exists()) {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] lineArr = line.split(",");

                Dyr tempAnimal;
                //IF D==DOG K==KAT
                if(lineArr[0].equals("D         ")) {
                    tempAnimal = new Hund(lineArr[0], lineArr[1], lineArr[2], lineArr[3], lineArr[4], lineArr[5], lineArr[6], Integer.parseInt(lineArr[7]), lineArr[8]);
                    bur.addAnimal(tempAnimal);
                    System.out.println(tempAnimal);
                } else if(lineArr[0].equals("Cat       ")) {
                    tempAnimal = new Cat(lineArr[0], lineArr[1], lineArr[2], lineArr[3], lineArr[4], lineArr[5], lineArr[6], Integer.parseInt(lineArr[7]), lineArr[8]);
                    bur.addAnimal(tempAnimal);
                    System.out.println(tempAnimal);
                } else {
                    System.out.println("Out of boundaries!");
                }

            }
        } else {
            throw new FileNotFoundException();
        }
    }

}