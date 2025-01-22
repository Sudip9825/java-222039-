// Car.java
class Car extends Vehicle {
    // Car HAS_A Engine
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}
