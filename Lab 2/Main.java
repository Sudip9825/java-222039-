// Main.java
public class Main {
    public static void main(String[] args) {
        // Task 1: Create Person object and use getter/setter methods
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        // Task 2: Abstract class and inheritance
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();

        // Task 3: Inheritance
        Car car = new Car();
        car.startEngine();

        // Task 4: Composition
        car.startCar();

        // Task 5: Polymorphism
        MathOperations mathOps = new MathOperations();
        System.out.println("Addition of integers: " + mathOps.add(5, 3));
        System.out.println("Addition of doubles: " + mathOps.add(5.5, 3.3));

        ParentClass parent = new ParentClass();
        parent.display();

        ChildClass child = new ChildClass();
        child.display();

        // Task 6: Exception handling
        ExceptionExample.main(args);
    }
}
