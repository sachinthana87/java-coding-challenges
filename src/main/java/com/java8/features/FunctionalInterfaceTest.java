package com.java8.features;

interface Person {
    default String getName() {
        return null;
    }

    int getAge();

    String getSex();
}

@FunctionalInterface
interface Car {
    default int getWheels() {
        return 4;
    }

    String getMake();

//    String getModel();
}

public class FunctionalInterfaceTest {
    static Car nissan = () -> "Nissan";
    static Car toyota = () -> "Toyota";

    Runnable runnable = () -> System.out.println("Runnable");

    public static void main(String[] args) {
        System.out.println(nissan.getMake() + " _ " + nissan.getWheels());
        System.out.println(toyota.getMake() + " _ " + nissan.getWheels());
    }
}
