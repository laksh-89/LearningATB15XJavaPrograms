package ex_13_Arrays;

public class Lab072_Pyramid_pattern {
    public static void main(String[] args) {

        int n=5;

         for (int i=0; i<=n; i++) {
             for (int space=1; space<=n-i;space++) {
                 System.out.print(" ");
             }
             for (int pyramid=1; pyramid<=i; pyramid++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
