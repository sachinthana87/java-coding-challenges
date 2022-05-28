package com.java.basics;

import com.challages.leetcode.ValidParentheses;

public class InnerClassExample {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setNoOfWheels(4);
//        car.forward();


//        Vehicle.SpeedMeter speedMeter = new Vehicle(). new SpeedMeter();
//        speedMeter.updateSpeed();

//        Van van = new Van();
//        van.setNoOfWheels(4);
//        van.forward();


        double rand = Math.random();
        System.out.println(rand);

        System.out.println(TestInterface.value);
    }
}

class Vehicle {
    private int noOfWheels;

    void forward() {
        System.out.println("forward - Vehicle");
    }

    final void reverse() {
        System.out.println("reverse - Vehicle");
    }

    class SpeedMeter {

        void updateSpeed() {
            System.out.println(noOfWheels);
            forward();
            reverse();
        }


    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}

class Car extends Vehicle {
//    @Override
//    void forward() {
//        System.out.println("forward - Car");
//    }
}

final class Van extends  Vehicle {
    @Override
    void forward() {
        System.out.println("forward - Van");
    }

//    @Override
//    void reverse() {
//        System.out.println("forward - Van");
//    }
}

//class Corolla extends  Car {
//
//}
//
//class Caravan extends Van {
//
//}