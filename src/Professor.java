import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Person{

    private ArrayList<Abiturient> abiturients;
    public int workingOnId;

    public Professor(String name, String surname)
    {
        super(name, surname);
    }

    public void markAbiturients(Facultet facultet){
        System.out.println("Choose exam from 0 to " + (facultet.getNumOfExams()-1));
        for (Result r:facultet.getResultsFrom(TryParse.ParseInt())) {
            System.out.println(r.answer);
            r.mark = TryParse.ParseInt();
        }






    }
}
