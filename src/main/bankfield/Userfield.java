package main.bankfield;

public class Userfield {

    //adding the field of the class
    private  int customerBvn;
    private int customerAccountNumber;
    private double customerAccountBalance;
    public String customerName;
    private static String customerEmail;
    private int customerPhoneNumber;



    //creating a constructor
    public Userfield(int cusBvn,double withdrawal,int customerAccountNumber
    ){
        this.customerBvn=cusBvn;
        this.customerAccountBalance=withdrawal;
        this.customerAccountNumber=customerAccountNumber;
    }

    public void setCustomerBvn(int customerBvn) {
        this.customerBvn = customerBvn;

    }
//using getter

    public  int getCustomerBvn() {
        return customerBvn;
    }

    public int getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    //calculating the balance


    public double getCustomerAccountBalance() {
        return customerAccountBalance;
    }
}
