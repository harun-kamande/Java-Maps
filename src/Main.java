import com.maps.Simplemaps;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Set<Person> set1=new HashSet<>();
        set1.add(new Person<>(12,"Adams"));
        set1.add(new Person<>(12,"Adams"));
        set1.add(new Person<>(12,"Adams"));
        set1.add(new Person<>(32,"Wilson"));

        System.out.println(set1);

        Simplemaps map1=new Simplemaps();
        map1.add_something(12,"Peter");
        map1.add_something(1,"Peter");
        map1.add_something(34,"Johnson");


        System.out.println(map1.show_data());

    }
}