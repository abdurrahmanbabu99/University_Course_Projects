import java.lang.*;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

import classes.*;
import fileio.*;

public class Start {
    public static void main(String args[]) throws Exception {
        Authority authority = new Authority();
        FileReadWriteDemo frwd = new FileReadWriteDemo();
        Scanner sc = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);

        System.out.println("WelCome to the system");
        System.out.println("-------------------------------------------");

        boolean repeat = true;
        while (repeat) {
            System.out.println("Which option do you wanna take?");
            System.out.println("\t1. Customer Service");
            System.out.println("\t2. Authority Service");
            System.out.println("\t3. Exit");

            System.out.print("Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("You have chosen Customer Service");
                    System.out.println("-------------------------------------------");

                    System.out.println("You have the following options:");
                    System.out.println("\t1. Customer booking ride");
                    System.out.println("\t2. Insert New Customer");
                    System.out.println("\t3. Remove Existing Customer");
                    System.out.println("\t4. Go Back");

                    System.out.print("Your Option: ");
                    int option1 = sc.nextInt();

                    switch (option1) {
                        case 1:
                            System.out.println("-------------------------------------------");
                            System.out.println("Enter your customer id:");
                            String customerId = bfr.readLine();

                            Customer customer = authority.searchCustomer(customerId);
                            if (customer != null) {
                                System.out.println("Enter Pick Up Location: ");
                                String pickUpLocation = bfr.readLine();
                                System.out.println("Enter Drop Off Location: ");
                                String dropOffLocation = bfr.readLine();
                                System.out.println("Enter Destination: ");
                                String destination = bfr.readLine();
                                System.out.println("Enter Time: ");
                                String time = bfr.readLine();
                                double fare = new Random().nextInt(200) + 100.0;
                                System.out.println("Approximate fare: " + fare);

                                if (authority.booked(new Ride(pickUpLocation, dropOffLocation, destination, fare, customer,time))) {
                                    System.out.println("Your ride is set; thanks for using our services.");
                                } else {
                                    System.out.println("Sorry for now!");
                                }
                            } else {
                                System.out.println("Your are not register");
                            }
                            break;

                        case 2:
                            System.out.println("-------------------------------------------");
                            System.out.println("You have chosen to Insert a New Customer");

                            System.out.print("Enter Customer Id: ");
                            String customerId1 = bfr.readLine();
                            System.out.print("Enter Customer Name: ");
                            String customerName1 = bfr.readLine();
                            System.out.print("Enter Customer Nid: ");
                            String customerNid1 = bfr.readLine();
                            System.out.print("Enter Customer Address: ");
                            String customerAddress1 = bfr.readLine();
                            System.out.print("Enter Customer Phone number: ");
                            String customerPhoneNo1 = bfr.readLine();

                            Customer customer1 = new Customer(customerId1, customerName1, customerNid1, customerAddress1, customerPhoneNo1);

                            if (authority.insertCustomer(customer1)) {
                                System.out.println("Inserted.. CustomerId: " + customer1.getCustomerId());
                            } else {
                                System.out.println("Not Inserted.. CustomerId: " + customer1.getCustomerId());
                            }
                            System.out.println();
                            break;

                        case 3:
                            System.out.println("You have chosen to Remove an Customer");
                            System.out.println("-------------------------------------------");

                            System.out.print("Enter Customer Id: ");
                            String customerId2 = bfr.readLine();
                            Customer customer2 = authority.searchCustomer(customerId2);
                            if (customer2 != null) {
                                if (authority.removeCustomer(customer2)) {
                                    System.out.println("Removed.... CustomerId: " + customer2.getCustomerId());
                                }else {
                                    System.out.println("Not Removed.... CustomerId: " + customer2.getCustomerId());
                                }

                            } else {
                                System.out.println("11Customer Not Found " );
                            }
                            System.out.println();
                            break;

                        case 4:
                            System.out.println("You have chosen to Go Back");
                            System.out.println("-------------------------------------------");

                            break;

                        default:

                            System.out.println("Invalid Option");
                            System.out.println("-------------------------------------------");

                            break;
                    }
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("You have chosen Authority");
                    System.out.println("-------------------------------------------");

                    System.out.println("You have the following options:");
                    System.out.println("\t1. Car Management ");
                    System.out.println("\t2. Driver Management");
                    System.out.println("\t3. Ride Management");
                    System.out.println("\t4. Show All Customer");
                    System.out.println("\t5. Go Back");

                    System.out.print("Your Option: ");
                    int option2 = sc.nextInt();

                    switch (option2) {
                        case 1:
                            System.out.println("-------------------------------------------");
                            System.out.println("You have chosen Car Management");
                            System.out.println("-------------------------------------------");

                            System.out.println("You have the following options:");
                            System.out.println("\t1. Insert Car ");
                            System.out.println("\t2. Available Car");
                            System.out.println("\t3. Remove Car");
                            System.out.println("\t4. Show All Car");
                            System.out.println("\t5. Go Back");

                            System.out.print("Your Select: ");
                            int select1 = sc.nextInt();
                            switch (select1) {
                                case 1:
                                    System.out.println("-------------------------------------------");
                                    System.out.println("You have chosen to Insert a Car");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Enter your Car no:");
                                    String carNo1 = bfr.readLine();

                                    System.out.println("Car model: ");
                                    String carModel1 = bfr.readLine();
                                    System.out.println("Car color: ");
                                    String carColor1 = bfr.readLine();
                                    System.out.println("Car Type: ");
                                    String carType1 = bfr.readLine();
                                    System.out.println("Capacity: ");
                                    int capacity1 = sc.nextInt();
                                    Car car1 = new Car(carNo1, carModel1, carColor1, carType1, capacity1);
                                    if (authority.insertCar(car1)) {
                                        System.out.println("Inserted.. CarNo: " + car1.getCarNo());
                                    } else {
                                        System.out.println("Not Inserted.. CarNo: " + car1.getCarNo());
                                    }
                                    System.out.println();
                                    break;


                                case 2:
                                    System.out.println("-------------------------------------------");
                                    System.out.println("You have chosen available cars");

                                    Car[] cars = authority.getCars();
                                    for (int i = 0; i < cars.length; i++) {
                                        if (cars[i]!=null && cars[i].isFree()) {
                                            cars[i].showDetails();
                                        }
                                    }
                                    break;

                                case 3:
                                    System.out.println("You have chosen to Remove a Car");
                                    System.out.println("-------------------------------------------");

                                    System.out.print("Enter Car No : ");
                                    String carNo2 = bfr.readLine();
                                    Car car2 = authority.searchCar(carNo2);
                                    if (carNo2 != null) {
                                        if (authority.removeCar(car2)) {
                                            System.out.println("Removed.... CarNo: " + car2.getCarNo());
                                        }else {
                                            System.out.println("Not Removed.... Car NO: " + car2.getCarNo());
                                        }

                                    } else {
                                        System.out.println(" Car Not found: " );
                                    }
                                    System.out.println();
                                    break;

                                case 4:
                                    System.out.println("You have chosen to Show All Car");
                                    System.out.println("-------------------------------------------");
                                    authority.showAllCars();
                                    System.out.println();
                                    break;

                                case 5:
                                    System.out.println("You have chosen to Go Back");
                                    System.out.println("-------------------------------------------");
                                    break;

                                default:

                                    System.out.println("Invalid Option");
                                    System.out.println("-------------------------------------------");
                                    break;

                            }
                            break;

                        case 2:
                            System.out.println("-------------------------------------------");
                            System.out.println("You have chosen Driver Management");
                            System.out.println("-------------------------------------------");

                            System.out.println("You have the following options:");
                            System.out.println("\t1. Insert Driver ");
                            System.out.println("\t2. Available Driver");
                            System.out.println("\t3. Remove Driver");
                            System.out.println("\t4. Show All Driver");
                            System.out.println("\t5. Go Back");

                            System.out.print("Your Select: ");
                            int select2 = sc.nextInt();
                            switch (select2) {
                                case 1:
                                    System.out.println("-------------------------------------------");
                                    System.out.println("You have chosen to Insert a Driver");
                                    System.out.println("-------------------------------------------");

                                    System.out.print("Enter Driver Id: ");
                                    String driverId1 = bfr.readLine();
                                    System.out.print("Enter Driver Name: ");
                                    String driverName1 = bfr.readLine();
                                    System.out.print("Enter Driver Nid: ");
                                    String driverNid1 = bfr.readLine();
                                    System.out.print("Enter Driver Address: ");
                                    String driverAddress1 = bfr.readLine();
                                    System.out.print("Enter Driver Phone number: ");
                                    String driverPhoneNo1 = bfr.readLine();
                                    System.out.print("Enter Driver License number: ");
                                    String driverLicenseNo1 = bfr.readLine();
                                    Driver driver1 = new Driver(driverId1, driverName1, driverNid1, driverAddress1, driverPhoneNo1, driverLicenseNo1);
                                    if (authority.insertDriver(driver1)) {
                                        System.out.println("Inserted.. DriverId: " + driver1.getDriverId());
                                    } else {
                                        System.out.println("Not Inserted.. DriverId: " + driver1.getDriverId());
                                    }
                                    System.out.println();
                                    break;


                                case 2:
                                    System.out.println("-------------------------------------------");
                                    System.out.println("You have chosen to See Available Driver");

                                    Driver[] drivers = authority.getDrivers();
                                    for (int i = 0; i < drivers.length; i++) {
                                        if (drivers[i] != null && drivers[i].isFree()) {
                                            drivers[i].showDetails();
                                        }
                                    }
                                    System.out.println();
                                    break;

                                case 3:
                                    System.out.println("You have chosen to Remove a Driver");
                                    System.out.println("-------------------------------------------");

                                    System.out.print("Enter Driver Id : ");
                                    String driverId3 = bfr.readLine();
                                    Driver driver3 = authority.searchDriver(driverId3);
                                    if (driver3 != null) {
                                        if (authority.removeDriver(driver3)) {
                                            System.out.println("Removed.... Driver Id: " + driver3.getDriverId());
                                        } else {
                                            System.out.println("Not Removed....Driver Id: " + driver3.getDriverId());
                                        }
                                    } else {
                                        System.out.println("Driver Not Found  " );
                                    }
                                    System.out.println();
                                    break;
                                case 4:
                                    System.out.println("You have chosen to Show All Driver");
                                    System.out.println("-------------------------------------------");
                                    authority.showAllDrivers();
                                    System.out.println();
                                    break;
                                case 5:
                                    System.out.println("You have chosen to Go Back");
                                    System.out.println("-------------------------------------------");

                                    break;

                                default:

                                    System.out.println("Invalid Option");
                                    System.out.println("-------------------------------------------");

                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("-------------------------------------------");
                            System.out.println("You have chosen Ride Management");
                            System.out.println("-------------------------------------------");

                            System.out.println("You have the following options:");
                            System.out.println("\t1. Show All Ride ");
                            System.out.println("\t2. Go Back");

                            System.out.print("Your Select: ");
                            int select3 = sc.nextInt();
                            switch (select3) {
                                case 1:
                                    System.out.println("-------------------------------------------");
                                    System.out.println("You have chosen Ride Details");
                                    System.out.println("-------------------------------------------");
                                    frwd.readFromFile();

                                    break;

                                case 2:
                                    System.out.println("You have chosen to Go Back");
                                    System.out.println("-------------------------------------------");
                                    break;

                                default:

                                    System.out.println("Invalid Option");
                                    System.out.println("-------------------------------------------");
                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("-------------------------------------------");
                            System.out.println("You have chosen Show All Customer");
                            System.out.println("-------------------------------------------");
                            authority.showAllCustomers();
                            break;

                        default:
                            System.out.println("Invalid Option");
                            System.out.println("-------------------------------------------");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("-------------------------------------------");
                    System.out.println("You have chosen to Exit");
                    System.out.println("-------------------------------------------");

                    repeat = false;

                    break;

                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("Invalid Choice...............");
                    System.out.println("-------------------------------------------");
                    break;
            }

        }
    }
}