import java.util.Comparator;

public class AbiturientComparator implements Comparator<Abiturient> {
    public int compare(Abiturient a1, Abiturient a2) {
        if (a1.avgMark == a2.avgMark) {
            return 0;
        }
        if (a1.avgMark > a2.avgMark) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

