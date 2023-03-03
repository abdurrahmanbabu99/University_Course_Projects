package classes;

import interfaces.ICar;
import java.lang.*;
public class Car
{
    private String carNo;
    private String carModel;
    private String carColor;
    private String carType;
    private int capacity;
    private Driver driver;
    private boolean free;

    public Car(String carNo, String carModel, String carColor, String carType, int capacity)
    {
        this.carNo = carNo;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carType = carType;
        this.capacity = capacity;
        this.driver = null;
        this.free= true;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public String getCarNo() {
        return carNo;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getCarType() {
        return carType;
    }

    public int getCapacity() {
        return capacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public boolean isFree() {
        return free;
    }

    public void showDetails() {
        System.out.println("Car Model : " + carModel);
        System.out.println("Car Color : " + carColor);
        System.out.println("Car Type : " + carType);
        System.out.println("Car Capacity : " + capacity);
        System.out.println("Car Number : " + carNo);
        if (!free) {
            System.out.println("***************------Driver Details-----*************");
            driver.showDetails();
        }
    }
}
