package main.bankfield;

import java.util.Scanner;

public class Bankcheck {
    Scanner scanner = new Scanner(System.in);
    Userfield bankAccount;


public Bankcheck(Userfield userAccount){
    this.bankAccount=userAccount;

};


    public int bvnAccountMethod() {

        System.out.println("  enter your bvn for loggin check :");
        String bvnCheck = scanner.nextLine();

        //converting the bvn to integer
        int bvnConvert = Integer.parseInt(bvnCheck);
        //getting the system stored bvn for validation

        //using ternary to check
        return bvnConvert;

    }
    public boolean accNumberCheck(){
        int systemBvn = bankAccount.getCustomerBvn();
        int bvnCheck=bvnAccountMethod();
        try {
            if(bvnCheck!=systemBvn){
System.out.println("invalid");
                return false;
            }

            System.out.println("please enter your account number for loggin check :");
            String accCheck = scanner.nextLine();
            int accConverted=Integer.parseInt(accCheck);
            if (accConverted == bankAccount.getCustomerAccountNumber()) {
                System.out.println("you are logged in successfully");
                return true;
            }
            else{
                return false;
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;

        }

    }
    public void  withdrawalUpdate(){
        //using scanner to input withdrawal amount
        System.out.println("how much do you want to withdraw ?");

        String inputWithdrawal= scanner.nextLine();
        double withdrawalConverted=Double.parseDouble(inputWithdrawal);
        double currentBalance=bankAccount.getCustomerAccountBalance() ;
        if(currentBalance-withdrawalConverted<=0){
            System.out.println(" withdrawal cannot be proceed, insufficient funds");

        }
        currentBalance-=withdrawalConverted;
        System.out.println("account has been debited #"+inputWithdrawal +
                "current balance is  #" +
                +currentBalance);

    };


}