package ex_02_Java_Basics;

public class Lab021_Max_Min {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int max = x>y ? x : y;
        int min = x>y ? y : x;
        System.out.println(max);
        System.out.println(min);

    }
}
