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
    public String accNumberCheck(){
        int systemBvn = bankAccount.getCustomerBvn();
        int bvnCheck=bvnAccountMethod();
        try {
            if(bvnCheck!=systemBvn){
                return "invalid bvn";
            }

            System.out.println("bvn check is valid");
            System.out.println("please enter your account number for loggin check :");
            String accCheck = scanner.nextLine();
            int accConverted=Integer.parseInt(accCheck);
            if (accConverted == bankAccount.getCustomerAccountNumber()) {
                System.out.println("you are logged in successfully");
                return "success";
            }
            else{
                return "invalid detail";
            }

        } catch (NumberFormatException e) {
            return "invalid parsed data";

        }

    }

}