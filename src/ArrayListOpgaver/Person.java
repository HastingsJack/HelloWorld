package ArrayListOpgaver;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}

