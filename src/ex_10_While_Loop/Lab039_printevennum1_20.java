package ex_10_While_Loop;

public class Lab039_printevennum1_20 {
    public static void main(String[] args) {
        int i=1;
        while (i<=20) {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
