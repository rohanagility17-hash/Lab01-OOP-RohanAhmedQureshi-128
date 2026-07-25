public class Mobile {

    private String brand;
    private String model;
    private int battery;
    private boolean powerOn;

    public Mobile() {
        brand = "Not Set";
        model = "Not Set";
        battery = 100;
        powerOn = false;
    }

    public void setDetails(String mobileBrand, String mobileModel) {
        brand = mobileBrand;
        model = mobileModel;
        System.out.println("Mobile details saved successfully.");
    }

    public void powerOn() {
        if (powerOn) {
            System.out.println(brand + " is already ON.");
            return;
        }

        powerOn = true;
        System.out.println(brand + " has been powered ON.");
    }

    public void powerOff() {
        if (!powerOn) {
            System.out.println(brand + " is already OFF.");
            return;
        }

        powerOn = false;
        System.out.println(brand + " has been powered OFF.");
    }

    public void makeCall() {
        if (!powerOn) {
            System.out.println("Please turn on the mobile first.");
            return;
        }

        battery -= 5;
        System.out.println("Calling from " + brand + "...");
    }

    public void chargeBattery() {
        battery = 100;
        System.out.println("Battery fully charged.");
    }

    public void displayInfo() {
        System.out.println("========== Mobile ==========");
        System.out.println("Brand   : " + brand);
        System.out.println("Model   : " + model);
        System.out.println("Battery : " + battery + "%");
        System.out.println("Power   : " + (powerOn ? "ON" : "OFF"));
        System.out.println("============================");
    }
}