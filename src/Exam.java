import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    String predmet1, predmet2, predmet3;
    private ArrayList<Exam>arrayExams;
    Scanner scanner = new Scanner(System.in);

    public Exam(){arrayExams = new ArrayList<>(5);}

    public ArrayList<Exam> getArrayExams() {
        return arrayExams;
    }

    public void setArrayExams(ArrayList<Exam> arrayExams) {
        this.arrayExams = arrayExams;
    }


        public void createExamlist() {
        System.out.println("Create new Exam list");
        System.out.println("Enter a name of first predmet");
        predmet1 = scanner.next();
        System.out.println("Enter a name of second predmet:");
        predmet2 = scanner.next();
        System.out.println("Enter a name of third predmet:");
        predmet3 = scanner.next();

         Exam exam= new Exam(predmet1, predmet2, predmet3);
        arrayExams.add(exam);
        System.out.println("Created new Exam list");
    }
}
