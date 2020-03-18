import java.util.ArrayList;

public class Bur {

    String burName;
    int id = 0;
    ArrayList<Dyr> dyrArr;


    public Bur(String burName) {
        this.burName = burName;
        //this.id = id;
        dyrArr = new ArrayList<>();
    }

    public void addAnimal(Dyr dyr){
        dyrArr.add(dyr);
    }

    //TODO: LARM
    public void larm(){
    }


    //GETTERS & SETTERS


    public String getBurName() {
        return burName;
    }

    public void setBurName(String burName) {
        this.burName = burName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Dyr> getDyrArr() {
        return this.dyrArr;
    }

    public void setDyrArr(ArrayList<Dyr> dyrArr) {
        this.dyrArr = dyrArr;
    }

    @Override
    public String toString() {
        return "Bur{" +
                "burName='" + burName + '\'' +
                ", id=" + id +
                ", dyrArr=" + dyrArr +
                '}';
    }
}