public class Abiturient {
private String name;
private String surname;
private int number;

public Abiturient(String name, String surname, int number)
{
    this.name=name;
    this.surname=surname;
    this.number=number;
}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
