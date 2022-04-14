public class CarManufacturer implements Runnable {
    private CarShowroom carShowroom;

    public CarManufacturer(CarShowroom carShowroom) {
        this.carShowroom = carShowroom;
    }

    @Override
    public void run() {
        while (carShowroom.soldCars()<carShowroom.salesProgram()) {
            carShowroom.carManufacture();
        }
    }
}
