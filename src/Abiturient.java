public class Abiturient extends Person {
private int number;

public Abiturient(String name, String surname, int number)
{
    super(name, surname);
    this.number=number;
}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
