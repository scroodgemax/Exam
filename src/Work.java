import java.util.Scanner;

public class Work {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For the enter to system pres:\n 1 - if you a facultet manager; \n 2 - if you a professor; \n 3 - if you an abiturient.");
        int i = scanner.nextInt();
        switch (i)
        {
            case 1:
                int m=3;
                while (i!=0) {
                    System.out.println("Enter 1 - for create Exam List; \n 2 - for the work with abiturients; \n 0 - for exit. ");
                    m = scanner.nextInt();
                    switch (m)
                    {
                        case 1:
                            exam.createExam();
                    }
                }

            case 2:
            case 3:
            default:
                System.out.println("You are wrong!! Go out");
        }
    }
}
