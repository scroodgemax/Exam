import java.util.ArrayList;
import java.util.Scanner;

public class Abiturient extends Person {
private int id;
public float avgMark;

public Abiturient(String name, String surname, int id)
{
    super(name, surname);
    this.id=id;
}

    public int getId() {return id;}


    public void answerExams(Facultet facultet){
        System.out.println("Answer exams");
        for (int i=0; i<facultet.getNumOfExams(); i++){
            System.out.print("\n Please, answer exam #" + i + "\n");
            facultet.getResultsFrom(i).get(id).answer=TryParse.ParseString();
        }
    }
}
