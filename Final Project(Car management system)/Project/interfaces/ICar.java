package interfaces;

import classes.Car;
import java.lang.*;
public interface ICar {
    Car availableCar();
    boolean insertCar(Car car);
    boolean removeCar(Car car);
    void showAllCars();
}
