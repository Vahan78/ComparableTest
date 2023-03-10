import java.util.Comparator;

public class AgeComparator extends MyComparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return setting(o1.age - o2.age);
    }
}
