package interfaces;

import classes.*;
import java.lang.*;

public interface ICustomer {
    boolean booked(Ride ride);
    boolean insertCustomer(Customer customer);
    boolean removeCustomer(Customer customer);
    void showAllCustomers();
}
