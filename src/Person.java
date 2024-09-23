public class Person {
    String firstName;
    String lastName;
    Double shoesize;

    public Person(String firstName, String lastName, Double shoesize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shoesize = shoesize;
    }

    public void udskrivPerson() {
        System.out.println(this.lastName + ", " + this.firstName + " Shoesize: " + this.shoesize);
    }
}
