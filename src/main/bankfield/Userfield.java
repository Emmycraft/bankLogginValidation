package main.bankfield;

public class Userfield {

    //adding the field of the class
    private  int customerBvn;
    private int customerAccountNumber=222222;
    private int customerAccountBalance;
    public String customerName;
    private static String customerEmail;
    private int customerPhoneNumber;



    //creating a constructor
    public Userfield(int cusBvn){
        this.customerBvn=cusBvn;
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
    public int calculateBalance(){
        customerAccountBalance=250;
        return customerAccountBalance;
    }
}
