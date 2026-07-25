public class Main {
    public static void main(String[] args) {

        Mobile phone1 = new Mobile();
        Mobile phone2 = new Mobile();

        phone1.setDetails("Samsung", "Galaxy A55");
        phone2.setDetails("iPhone", "15 Pro");

        phone1.powerOn();
        phone2.powerOn();

        phone1.makeCall();
        phone2.makeCall();

        phone1.displayInfo();
        phone2.displayInfo();
    }
}