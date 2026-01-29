package ex_13_Arrays;

import java.util.Arrays;

public class Lab065_second_highest_num {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 55, 155, 175, 199, 150};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);


    }
}
