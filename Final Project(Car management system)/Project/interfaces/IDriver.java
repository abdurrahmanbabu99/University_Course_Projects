package interfaces;

import classes.Driver;
import java.lang.*;

public interface IDriver {
    Driver availableDrivers();
    boolean insertDriver(Driver driver);
    boolean removeDriver(Driver driver);
    void showAllDrivers();
}
