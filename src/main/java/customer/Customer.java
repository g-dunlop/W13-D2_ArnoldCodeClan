package customer;

import behaviour.IDrive;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<IDrive> vehicles;

    public Customer(double money){
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<IDrive> getVehicles() {
        return vehicles;
    }

    public int getNumberOfVehicles(){
        return this.vehicles.size();
    }

    public void addCar(IDrive vehicle) {
        this.vehicles.add(vehicle);
    }

    public void buyVehicle(IDrive vehicle){
        if (this.money >= (((Vehicle) vehicle).getPrice())) {
                this.money -= (((Vehicle) vehicle).getPrice());
                addCar(vehicle);
        }

    }
}
