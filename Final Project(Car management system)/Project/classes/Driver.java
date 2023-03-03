package classes;

import interfaces.IDriver;
import java.lang.*;

public class Driver extends User {

    private String driverLicenseNo;
    private String driverId;
    private boolean free;


    public Driver( String driverId, String userName, String userNid, String userAddress, String userPhoneNo, String driverLicenseNo) {
        super(userName,  userNid, userAddress, userPhoneNo);
        this.driverId = driverId;
        this.driverLicenseNo = driverLicenseNo;
        this.free =true ;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public void setDriverLicenseNo(String driverLicenseNo) {
        this.driverLicenseNo = driverLicenseNo;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getDriverLicenseNo() {
        return driverLicenseNo;
    }

    public boolean isFree() {
        return free;
    }

    public void showDetails() {
        //super.showDetails();
        System.out.println("Driver Name : " + userName);
        System.out.println("Driver Nid Number : " + userNid);
        System.out.println("Driver Address : " + userAddress);
        System.out.println("Driver Phone Number : " + userPhoneNo);
        System.out.println("Driver Id: " + driverId);
        System.out.println("Driver License Number: " + driverLicenseNo);
    }
}
