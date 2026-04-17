package ex_16_Encapsulation;

public class Bank_Account_Main {

    public static void main(String[] args) {

        Bank_Account ba= new Bank_Account();
        ba.setAccno(100101);
        ba.setName("Laksh");
        ba.setAmount(100000);
        System.out.println(ba.getAccno());
        System.out.println(ba.getName());
        System.out.println(ba.getAmount());
    }
}
