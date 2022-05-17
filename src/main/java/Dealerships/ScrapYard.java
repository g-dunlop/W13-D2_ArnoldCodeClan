package Dealerships;

import behaviour.IDrive;
import com.sun.xml.internal.bind.v2.model.core.ID;
import customer.Customer;
import vehicles.Vehicle;

import java.util.ArrayList;

public class ScrapYard {

    private double till;
    private ArrayList<IDrive> vehicles;

    public ScrapYard(double till) {
        this.till = till;
        this.vehicles = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<IDrive> getVehicles() {
        return vehicles;
    }

    public void addMoney(double payment) {
        this.till += payment;
    }

    public int vehicleCount(){
        return vehicles.size();
    }

    public void addVehicle(IDrive vehicle){
        vehicles.add(vehicle);
    }

    public IDrive removeVehicle(IDrive vehicle){
        vehicles.remove(vehicle);
        return vehicle;
    }

    public void sellVehicle(IDrive vehicle, Customer customer){
        customer.buyVehicle(removeVehicle(vehicle));
        addMoney(((Vehicle) vehicle).getPrice());
    }
}
