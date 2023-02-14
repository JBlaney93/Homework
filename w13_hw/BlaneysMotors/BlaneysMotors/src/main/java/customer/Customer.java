package customer;

import vehicles.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double cashMoney;
    private ArrayList<Car> carsOwned;
    private Car car;

    public Customer(String name, double cashMoney, ArrayList<Car> carsOwned) {
        this.name = name;
        this.cashMoney = cashMoney;
        this.carsOwned = carsOwned;
    }

    public String getName() {
        return name;
    }

    public double getCashMoney() {
        return cashMoney;
    }

    public ArrayList<Car> getCarsOwned() {
        return carsOwned;
    }

    public void addCar(ArrayList<Car> carsOwned, Car car){
        carsOwned.add(car);
    }

    public void setCarsOwned(ArrayList<Car> carsOwned) {
        this.carsOwned = carsOwned;
    }
}
