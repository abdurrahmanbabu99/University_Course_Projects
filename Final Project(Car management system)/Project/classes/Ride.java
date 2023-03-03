package classes;

import java.lang.*;
import java.util.UUID;

public class Ride
{
    private String pickUpLocation;
    private String dropOffLocation;
    private String rideId;
    private String time;
    private String destination;
    private double fare;
    private Customer customer;
    private Car car;
    private Driver driver;

    public Ride(String pickUpLocation, String dropOffLocation, String rideId, String time, String destination, double fare, Customer customer, Car car, Driver driver) {
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideId = rideId;
        this.time = time;
        this.destination = destination;
        this.fare = fare;
        this.customer = customer;
        this.car = car;
        this.driver = driver;
    }

    public Ride(String pickUpLocation, String dropOffLocation, String destination, double fare, Customer customer,String time) {
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideId = UUID.randomUUID().toString();
        this.fare = fare;
        this.destination = destination;
        this.customer = customer;
        this.time=time;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void setCar(Car car) {
        this.customer = customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public String getRideId() {
        return rideId;
    }

    public String getTime() {
        return time;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    public Customer getCar() {
        return customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void showDetails()
    {
        System.out.println("Pick Up Location : " + pickUpLocation);
        System.out.println("Drop Off Location : " + dropOffLocation);
        System.out.println("Ride Id : " + rideId);
        System.out.println("Approximate Time : " + time);
        System.out.println("Destination : " + destination);
        System.out.println("RIde Fare : " + fare);
        System.out.println("***************------Customer Details-----*************");
        customer.showDetails();
    }

    public String extractInformation() {
        return ("Pick Up Location : " + pickUpLocation +
                " Drop Off Location : " + dropOffLocation +
                "Ride Id : " + rideId +
                "Approximate Time : " + time +
                "Destination : " + destination +
                "RIde Fare : " + fare +
                "***************------Customer Details-----*************" +
                customer.extractInformation()
        );
    }
}
