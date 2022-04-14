public class Main {

    public static void main(String[] args) {
        CarShowroom carShowroom = new CarShowroom();
        CarBuyer carBuyer = new CarBuyer(carShowroom);
        CarManufacturer carManufacturer = new CarManufacturer(carShowroom);

        Thread carManufacturer1 = new Thread(carManufacturer, "Тойота");
        Thread carBuyer1 = new Thread(carBuyer, "Покупатель 1");
        Thread carBuyer2 = new Thread(carBuyer, "Покупатель 2");
        Thread carBuyer3 = new Thread(carBuyer, "Покупатель 3");
        carBuyer1.start();
        carBuyer2.start();
        carBuyer3.start();
        carManufacturer1.start();


    }
}
