package ex_10_While_Loop;

public class Lab042Reverse_Num {
    public static void main(String[] args) {
        int i=1234, reverse=0;
        while (i!=0) {
            int digit= i%10;
            reverse=reverse*10+digit;
            i=i/10;
        }
        System.out.println(reverse);
    }
}
