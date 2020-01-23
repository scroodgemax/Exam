import java.util.ArrayList;

public class Facultet {
    private ArrayList<Abiturient> arrayAbiturientes;

    public Facultet() {

        arrayAbiturientes = new ArrayList<>(5);
    }

    public ArrayList<Abiturient> getArrayAbiturientes() {
        return arrayAbiturientes;
    }

    public void setArrayAbiturientes(ArrayList<Abiturient> arrayAbiturientes) {
        this.arrayAbiturientes = arrayAbiturientes;
    }

    public void addAbiturient(String name, String surname, int number) {
        Abiturient abiturient = new Abiturient(name, surname, number);
        arrayAbiturientes.add(abiturient);
    }
}

