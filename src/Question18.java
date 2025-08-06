class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses petrol");
    }
}

public class Question18 {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.fuelType();
    }
}