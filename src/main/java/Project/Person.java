package Project;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person implements Serializable, Comparable<Person> {
    private String Name, Surname;
    private Integer Age;

    public Person(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = 15 + (int) (Math.random() * 15);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Name, person.Name) &&
                Objects.equals(Surname, person.Surname) &&
                Objects.equals(Age, person.Age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public int hashCode() {
        return 1 + 31 * Age + 21 * Name.hashCode() + Surname.hashCode();
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public Integer getAge() {
        return Age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.Name.compareTo(o.Name) == 0) {
            return this.Surname.compareTo(o.Surname);

        } else return this.Name.compareTo(o.Name);
    }
}
