import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.age = 20;
        Human h1 = new Human();
        h1.age = 20;


        System.out.println(h.compareTo(h1));
    }
}
