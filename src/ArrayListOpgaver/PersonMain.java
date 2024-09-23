package ArrayListOpgaver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Paul",27,150,76);
        Person p2 = new Person("George",28,181,77);
        Person p3 = new Person("John",29,182,70);
        Person p4 = new Person("Mary",30,163,75);
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        String searchHeight = "170";
        boolean found = false;
        for(Person p : people) {
        if(p.getHeight() >= Double.parseDouble(searchHeight)) {
            System.out.println("Height found: " + p.getName() + " is " + p.getHeight() + "cm");
            found = true;
        }
        }
        if(!found) {
            System.out.println("No one is taller than " + searchHeight);
        }
    }
}
