public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        // Car details
        car1.setDetails("Honda", "White");
        car2.setDetails("Tesla", "Red");

        System.out.println("Trying to drive before starting the engine...");
        car1.drive();

        car1.startEngine();
        car2.startEngine();

        car1.drive();
        car1.moveFast();
        car1.moveLeft();
        car1.horn();

        System.out.println();

        car2.drive();
        car2.moveRight();

        System.out.println("\nCurrent Status of Cars:");
        car1.displayState();
        car2.displayState();

        car1.moveSlow();
        car1.stopEngine();

        System.out.println("\nFinal Status:");
        car1.displayState();
        car2.displayState();
    }
}