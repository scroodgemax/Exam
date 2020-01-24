import java.util.ArrayList;

public class Facultet {
    private ArrayList<Abiturient> abiturients;
    private ArrayList<Exam> exams;

    public Facultet() {

        abiturients = new ArrayList<Abiturient>(5);
    }

    public ArrayList<Abiturient> getAbiturients() {
        return abiturients;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }
    public int getNumOfExams(){return exams.size();}
    public ArrayList<Result> getResultsFrom(int i) {
        return exams.get(i).results;
    }

    public void createAbiturient(String name, String surname) {
        Abiturient abiturient = new Abiturient(name, surname, abiturients.size());
        abiturients.add(abiturient);
        for (Exam e:exams) {
            e.results.add(new Result(abiturient.getId()));
        }
        abiturient.answerExams(this);
    }
}

