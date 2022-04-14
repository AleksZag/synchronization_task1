import java.util.ArrayList;
import java.util.List;

public class CarShowroom {

    private int carsInShowroom = 10;
    private List<Car> listOfSoldCars = new ArrayList<>();
    final private int salesProgram = 10;
    final private int TimeForDelivery = 600;
    final private int TimeForProduction = 500;


    public synchronized void buyCar() {

        while (soldCars() != salesProgram()) {

            try {
                System.out.println(Thread.currentThread().getName() + " зашёл в салон");

                while (carsInShowroom == 0) {
                    System.out.println("Авто нет в наличии в салоне, необходимо подождать");
                    wait();
                }
                Thread.sleep(TimeForDelivery);
                System.out.println(Thread.currentThread().getName() + " уехал на новом авто");

                carsInShowroom--;
                listOfSoldCars.add(new Car());

                System.out.println(listOfSoldCars.size() + " авто продано");
                System.out.println(carsInShowroom + " авто осталось в салоне");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    public synchronized void carManufacture() {


        try {
            Thread.sleep(TimeForProduction);
            System.out.println(Thread.currentThread().getName() + " выпустил и поставил в салон 1 автомобиль");
            carsInShowroom++;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public int soldCars() {
        return listOfSoldCars.size();
    }

    public int salesProgram() {
        return salesProgram;
    }

}



