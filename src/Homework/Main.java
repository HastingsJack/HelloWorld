package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jack", "jack@gmail.com");
        Student student2 = new Student("Jackie", "jackie@gmail.com");
        Student student3 = new Student("Jackielyn", "jackielyn@gmail.com");
        Classroom classroom1 = new Classroom();
        classroom1.addStudent(student1);
        classroom1.addStudent(student2);
        classroom1.addStudent(student3);
        System.out.println(classroom1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you searching for?");
        String input = scanner.nextLine();
        if(classroom1.searchFor(input) != null) {
            System.out.println("Student found.");
            System.out.println("What would you like to change?");
            System.out.println("1 for name, 2 for email");
            String change = scanner.nextLine();
            if(change.equals("1")) {
                System.out.println("What would you like to change their name to?");
                String newName = scanner.nextLine();
                classroom1.getStudent(input).setName(newName);
            }
            if(change.equals("2")) {
                System.out.println("What would you like to change their email to?");
                String newEmail = scanner.nextLine();
                classroom1.getStudent(input).setEmail(newEmail);
            }
        } else {
            System.out.println(input + " not found!");
        }
        System.out.println(classroom1);
    }
}
