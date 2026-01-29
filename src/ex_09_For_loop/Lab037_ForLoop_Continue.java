package ex_09_For_loop;

import java.util.Scanner;

public class Lab037_ForLoop_Continue {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Enter a no.");
        int num= Scanner.nextInt();
        for (int i=0; i<num; i++){
            if (i==5) {
                continue;
            }
                System.out.println(i);
            }
        System.out.println("End");

        }
    }
