package main;
import main.bankfield.Bankcheck;
import main.bankfield.Userfield;

public class Bankpayload {
   // Userfield bankAccount = new Userfield(1234);
    public static void main(String[] args) {

bankResult();


    }
    public  static void bankResult(){
        Userfield bankAccount=new Userfield(123);
        Bankcheck Bankcheckinstance=new Bankcheck(bankAccount);

        String bankCheckInstance=Bankcheckinstance.accNumberCheck();


        System.out.println(bankCheckInstance);

    };


}
