package ex_13_Arrays;

public class Lab062_Arrays_print {
    public static void main(String[] args) {
        int [] marks = {50, 52, 92, 77, 65};

        System.out.println(marks.length);
        System.out.println(marks [0]);
        System.out.println(marks [1]);
        System.out.println(marks [2]);
        System.out.println(marks [3]);
        System.out.println(marks [4]);

        System.out.println(" ========= ");
        for (int mark: marks) {
            System.out.println(mark);
        }

        System.out.println(" ========= ");

        for (int i=0; i< marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
