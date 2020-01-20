import java.util.ArrayList;

public class Facultet {
    private ArrayList<Abiturient>arrayAbiturientes;
    private ArrayList<Predmet>arrayPredmets;

    // private int rating;

    public Facultet (){
        arrayPredmets = new ArrayList<>(5);
        arrayAbiturientes = new ArrayList<>(5);
    }

    public ArrayList<Predmet> getArrayPredmets() {
        return arrayPredmets;
    }

    public void setArrayPredmets(ArrayList<Predmet> arrayPredmets) {
        this.arrayPredmets = arrayPredmets;
    }

    public ArrayList<Abiturient> getArrayAbiturientes() {
        return arrayAbiturientes;
    }

    public void setArrayAbiturientes(ArrayList<Abiturient> arrayAbiturientes) {
        this.arrayAbiturientes = arrayAbiturientes;
    }

    public void addAbiturient (String name, String surname, int number){
        Abiturient abiturient = new Abiturient(name, surname, number);
        arrayAbiturientes.add(abiturient);
    }
}
