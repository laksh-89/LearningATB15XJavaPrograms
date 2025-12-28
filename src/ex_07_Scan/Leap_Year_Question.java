package ex_07_Scan;

public class Leap_Year_Question {
    public static void main(String[] args) {

        int year= 2032;
        if (year%400 ==0 || (year %4==0 && year %100!=0))
        {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");

    }
}
}
