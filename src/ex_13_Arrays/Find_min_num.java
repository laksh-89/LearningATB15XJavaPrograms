package ex_13_Arrays;

public class Find_min_num {
    public static void main(String[] args) {

        int [] arr = {95, 55, 65, 75, 33, 21, 15, 10};
                int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }

        }
        System.out.println("Min = " +min);
    }
}
