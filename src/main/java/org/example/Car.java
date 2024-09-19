package org.example;

public class Car extends Vehicle{
    @Override
    public void Engine(){
        System.out.println("Car engine starts");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.Engine();
        vehicle.Engine();
    }
}
