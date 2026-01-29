package ex_13_Arrays;

public class Lab066_find_the_second_highest {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++) {

            if (numbers[i]>highest) {
                secondhighest=highest; highest=numbers[i];
            } else if (numbers[i]>secondhighest && numbers[i]<highest) {
                secondhighest= numbers[i];
            }
        }
        System.out.println("Second Highest number is:  " + secondhighest);
    }
}
