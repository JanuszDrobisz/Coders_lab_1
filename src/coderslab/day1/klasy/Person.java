package coderslab.day1.klasy;

public class Person {
    private String name = "Janusz";
    private String surname = "Drobisz";
    private int age = 33;
    private char gender = 'm';
    private String fullName;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public void increaseAge() {
        this.age += 1;
    }
}
