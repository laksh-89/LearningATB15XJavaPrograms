package ex_10_While_Loop;

public class Lab040_sum_first_10_num {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
