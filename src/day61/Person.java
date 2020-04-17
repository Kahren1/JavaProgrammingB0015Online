package day61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{
    String name;
    int age;
    //{Hasan, 34
    //{Nelishan, 18}
    //{Fatih, 34}
    //{Mohammed, 21}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>(Arrays.asList(new Person("Hasan", 34),
                new Person("Nelishan", 18),
                new Person("Fatih", 34), new Person("Mohammed", 21)));

        Collections.sort(persons);
        System.out.println(persons);

    }




//sort by age first asc, then by name asc
//sorting by multiple fields

    //can do name desc, age asc
    @Override
    public int compareTo(Person other) {
        if (this.age < other.age)
            return -1;
        else if (this.age > other.age)
            return 1;
        else {
            if (this.name.charAt(0) > other.name.charAt(0))
                return 1;
            else if (this.name.charAt(0) < other.name.charAt(0))
                return -1;
            else
                return 0;
        }
    }
}
