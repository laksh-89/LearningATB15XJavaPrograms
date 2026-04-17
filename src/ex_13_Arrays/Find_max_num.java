package ex_13_Arrays;

public class Find_max_num {
    public static void main(String[] args) {

        int[] arr = {15, 26, 45, 55, 12};

        int max = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max) {
                max = arr [i];
            }
        }
        System.out.println("Max = " +max);
    }
}
