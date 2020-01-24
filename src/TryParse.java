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
    public static int ParseInt(int from, int to)
    {
        do
        {
            String tmp = scanner.next();
            try {
                int i = Integer.parseInt(tmp);
                if (i>=from && i<=to)
                    return i;
            }
            catch (Exception e)
            {
                System.out.println("You should type integer in bounds from " + from + " to " + to +" !!! Not anything else!");
            }
        } while (true);
    }
    public static String ParseString()
    {
        return scanner.next();
    }
}
