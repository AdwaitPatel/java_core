package college.day3;

import java.util.List;
import java.util.stream.Collectors;

// parent class
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}

class VehicleFactory {
    static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Car"))
            return new Car();

        if (type.equalsIgnoreCase("Bike"))
            return new Bike();

        return null;
    }
}


class FactoryDemo {
    static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 123123;
        // here Object is the Parent class of these two classes (String and Integer)

        List<Integer> list = List.of(12, 43, 45, 65, 76, 434);

        // pipeline
        List<Integer> l1 = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());


    }
}