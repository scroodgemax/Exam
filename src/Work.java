import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Work {
    public static void main(String[] args)
    {

       Facultet faculty = new Facultet();

       System.out.println("Type number of exams");

       int num = TryParse.ParseInt();
        ArrayList<Exam> tmp = new ArrayList<Exam>(num);
        for (int i=0; i<num; i++)
           tmp.add(new Exam());
        faculty.setExams(tmp);


        System.out.println(" If you are student - type \"1\" \n If you are professor - type \"2\" \n To quit - type \"0\"");
        int choise = TryParse.ParseInt();
        while (choise!=0)
        {
            String name, surname;
            switch (choise)
            {
                case 1:
                    System.out.println("Please sign in and answer exams!");
                    System.out.print("Name: ");
                    name = TryParse.ParseString();
                    System.out.print("\n");
                    System.out.print("Surname: ");
                    surname = TryParse.ParseString();
                    System.out.print("\n");
                    faculty.createAbiturient(name, surname);
                    break;
                case 2:
                    System.out.println("Please sign in and mark exams!");
                    System.out.print("Name: ");
                    name = TryParse.ParseString();
                    System.out.print("\n");
                    System.out.print("Surname: ");
                    surname = TryParse.ParseString();
                    System.out.print("\n");
                    Professor professor = new Professor(name, surname);
                    professor.markAbiturients(faculty);
                    break;
                default:
                    System.out.println("Wrong number!!! Please return to school!!");
            }
            System.out.println(" If you are student - type \"1\" \n If you are professor - type \"2\" \n To quit - type \"0\"");
            choise = TryParse.ParseInt();
        }
        ArrayList<Abiturient> list = faculty.getAbiturients();
        for (Abiturient a:list) {
            for (int i=0; i<faculty.getNumOfExams(); i++)
            {
                a.avgMark += faculty.getResultsFrom(i).get(a.getId()).mark;
            }
            a.avgMark /= faculty.getNumOfExams();
        }
        list.sort(new AbiturientComparator());
        System.out.println("Student with the highest average mark is " + list.get(0).getName() + " " + list.get(0).getSurname());
        System.out.println("The average mark is: " + list.get(0).avgMark);
    }
}
