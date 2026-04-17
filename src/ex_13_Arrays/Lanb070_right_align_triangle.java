package ex_13_Arrays;

public class Lanb070_right_align_triangle {
    public static void main(String[] args) {

        int n=5;
        for (int i = 0; i < n; i++) {
            //0,1,2

            for (int space=0; space<n-i-1;space++) {
                System.out.print(" ");
            }
            for (int star=0;star<=i;star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
