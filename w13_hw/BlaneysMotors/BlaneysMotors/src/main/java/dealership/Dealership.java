package dealership;

import vehicles.Car;
import vehicles.CombustionCar;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> carsInStock;
    private double till;

    public Dealership(ArrayList<Car> carsInStock, double till) {
        this.carsInStock = carsInStock;
        this.till = till;
    }

    public ArrayList<Car> getCarsInStock() {
        return carsInStock;
    }

    public void addCarsToStock(Car car){
        carsInStock.add(car);
    }

    public double getTill() {
        return till;
    }

    public void removeCarFromStock(Car car) {
        carsInStock.remove(car);
    }
}
