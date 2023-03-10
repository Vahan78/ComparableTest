import java.util.Comparator;
import java.util.List;

public class Human extends MyComparable<Human> {
    public int age;

    @Override
    public int compareTo(Human o1) {
        return setting(this.age - o1.age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }

}
