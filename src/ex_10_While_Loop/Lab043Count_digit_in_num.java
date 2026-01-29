package ex_10_While_Loop;

public class Lab043Count_digit_in_num {
    public static void main(String[] args) {

        int i= 987654321, count=0;
        while (i!=0){
            count++;
            i=i/10;
        }
        System.out.println("Digits = " +count);
    }
}
