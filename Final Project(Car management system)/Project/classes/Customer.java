package classes;

import java.lang.*;

public class Customer extends User
{
    private String customerId;

    public Customer(String customerId, String userName, String userNid, String userAddress,String userPhoneNo)
    {
        super(userName, userNid, userAddress,userPhoneNo);
        this.customerId=customerId;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId=customerId;
    }
    public String getCustomerId()
    {
        return customerId;
    }
    public void showDetails()
    {
        //super.showDetails();
        System.out.println("Customer Name : " + userName);
        System.out.println("Customer Nid Number : " + userNid);
        System.out.println("Customer Address : " + userAddress);
        System.out.println("Customer Phone Number : " + userPhoneNo);
        System.out.println("Customer Id: "+ customerId);
    }
    public String extractInformation() {
        return ("Customer Name : " + userName +
                "Customer Nid Number : " + userNid +
                "Customer Address : " + userAddress +
                "Customer Phone Number : " + userPhoneNo +
                "Customer Id: "+ customerId);
    }
}
