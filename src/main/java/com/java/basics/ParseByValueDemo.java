package com.java.basics;

public class ParseByValueDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Sachinthana", 34);
        System.out.println(person1);
        person1.changeDetails("Janitha", 33);
        System.out.println(person1);

        Person person2;
        person2 = person1;
        person2.changeDetails("Mary", 30);
        System.out.println(person1);
        System.out.println(person2);

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name: " + name + ", age: " + age;
    }

    public void changeDetails (String name, int age) {
        this.name = name;
        this.age = age;
    }
}