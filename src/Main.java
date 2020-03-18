import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Bur bur = new Bur("Cage");

        ImportDyr importDyr = new ImportDyr();
        importDyr.importAnimals(bur);

        for(Dyr d : bur.dyrArr) {
            System.out.println(d);
        }
    }
}
