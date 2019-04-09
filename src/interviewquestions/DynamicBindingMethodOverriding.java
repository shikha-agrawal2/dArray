package interviewquestions;
/*static binding occurs on compile time and Type information is used to resolve methods.
In this section we will see example of dynamic binding in java which occurs during run time and instead of Type or Class information,
Object is used to resolve method calls.
 */

public class DynamicBindingMethodOverriding {
    public static void main(String args[]) {
        Vehicle vehicle = new Car(); //here Type is vehicle but object will be Car
        vehicle.start();       //Car's start called because start() is overridden method
    }
}

class Vehicle {

    public void start() {
        System.out.println("Inside start method of Vehicle");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Inside start method of Car");
    }
}

