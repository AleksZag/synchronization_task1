public class CarBuyer implements Runnable {

    private CarShowroom carShowroom;

    public CarBuyer(CarShowroom carShowroom) {
        this.carShowroom = carShowroom;
    }

    @Override
    public void run() {
        carShowroom.buyCar();
    }
}
