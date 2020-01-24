import java.util.Scanner;

public class TryParse {
    static Scanner scanner = new Scanner(System.in);

    public static int ParseInt()
    {
        do
        {
           String tmp = scanner.next();
           try {
               return Integer.parseInt(tmp);
           }
           catch (Exception e)
           {
               System.out.println("You should type integer!!! Not anything else!");
           }
        } while (true);
    }
    public static String ParseString()
    {
        return scanner.next();
    }
}
