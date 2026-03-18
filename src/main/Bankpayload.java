package main;
import main.bankfield.Bankcheck;
import main.bankfield.Userfield;

public class Bankpayload {
   // Userfield bankAccount = new Userfield(1234);
    public static void main(String[] args) {

bankResult();


    }
    public  static void bankResult(){
        Userfield bankAccount=new Userfield(123,50,13105620,"samuel okoh");
        Bankcheck Bankcheckinstance=new Bankcheck(bankAccount);


        bankAccount.setCustomerBvn(333);
        boolean bankValidCheck=Bankcheckinstance.accNumberCheck();
if(bankValidCheck){
    Bankcheckinstance.withdrawalUpdate();
    String customerName = bankAccount.customerName;
    System.out.println();
}





    };


}
