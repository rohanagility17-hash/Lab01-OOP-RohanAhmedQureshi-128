public class Car {

    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuel;
    private int gear;

    public Car() {
        brand = "Not Set";
        color = "No Color";
        speed = 0;
        engineOn = false;
        fuel = 100.0;
        gear = 0;
    }

    public void setDetails(String carBrand, String carColor) {
        brand = carBrand;
        color = carColor;
        System.out.println("Car details saved successfully.");
    }

   public void startEngine() {

    if (engineOn) {
        System.out.println(brand + " engine is already running.");
        return;
    }

    if (fuel <= 0) {
        System.out.println(brand + " cannot start because the fuel tank is empty.");
        return;
    }

    engineOn = true;
    gear = 1;
    System.out.println(brand + " engine has started.");
}
   public void stopEngine() {

    if (!engineOn) {
        System.out.println(brand + " engine is already off.");
        return;
    }

    engineOn = false;
    speed = 0;
    gear = 0;
    System.out.println(brand + " engine has been turned off.");
}

    public void drive() {
        if (!engineOn) {
            System.out.println(brand + " cannot move. Please start the engine first.");
            return;
        }

        speed = 20;
        useFuel(2);
        System.out.println(brand + " is moving at " + speed + " km/h.");
    }

    public void moveFast() {
        if (!engineOn) {
            System.out.println(brand + " cannot speed up while the engine is off.");
            return;
        }

        speed += 30;
        useFuel(4);
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }

    public void moveSlow() {
        if (!engineOn) {
            System.out.println(brand + " cannot reduce speed because the engine is off.");
            return;
        }

        speed = Math.max(0, speed - 15);
        System.out.println(brand + " reduced speed to " + speed + " km/h.");
    }

    public void moveLeft() {
        if (!engineOn) {
            System.out.println(brand + " cannot turn left.");
            return;
        }

        System.out.println(brand + " turned left.");
    }

    public void moveRight() {
        if (!engineOn) {
            System.out.println(brand + " cannot turn right.");
            return;
        }

        System.out.println(brand + " turned right.");
    }

    public void horn() {
        System.out.println(brand + " Horn: Beep Beep!");
    }

    private void useFuel(double amount) {
        fuel = Math.max(0, fuel - amount);

        if (fuel == 0) {
            System.out.println(brand + " has run out of fuel.");
            stopEngine();
        }
    }

    public void displayState() {
        System.out.println("========== " + brand + " ==========");
        System.out.println("Color   : " + color);
        System.out.println("Speed   : " + speed + " km/h");
        System.out.println("Gear    : " + gear);
        System.out.println("Engine  : " + (engineOn ? "ON" : "OFF"));
        System.out.println("Fuel    : " + fuel + "%");
        System.out.println("============================");
    }
}