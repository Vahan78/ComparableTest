import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyComparator<T> {

    public int compare(T o1, T o2) {
        return 0;
    }

    public int setting(int result) {

        int t = 0;

        if (result > 0) {
            t = 1;
        }


        if (result < 0) {
            t = -1;
        }

        return t;
    }
}
