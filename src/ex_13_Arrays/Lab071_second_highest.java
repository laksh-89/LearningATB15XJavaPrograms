package ex_13_Arrays;

public class Lab071_second_highest {
    public static void main(String[] args) {

        int[] numbers= {12,45, 67, 23, 89, 45, 89};
            int highest =0;
            int SecondHighest = 0;

            for (int num: numbers) {
                if (num>highest) {
                    SecondHighest=highest;
                    highest=num;
                } else if (num>SecondHighest && num!=highest) {
                    SecondHighest=num;
                }
            }
            System.out.println(SecondHighest);
        }
    }
