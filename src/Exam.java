import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    private ArrayList<Exam>arrayExams;
    Scanner scanner = new Scanner(System.in);

public Exam(){arrayExams = new ArrayList<>(5);}

    public ArrayList<Exam> getArrayExams() {
        return arrayExams;
    }

    public void setArrayExams(ArrayList<Exam> arrayExams) {
        this.arrayExams = arrayExams;
    }

}
