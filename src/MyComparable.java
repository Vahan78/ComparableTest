import java.util.LinkedHashMap;
import java.util.Map;

public class MyComparable<T> {
    public int compareTo(T o1){
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
