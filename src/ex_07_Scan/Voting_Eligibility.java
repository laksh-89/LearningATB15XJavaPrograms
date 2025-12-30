package ex_07_Scan;

import java.util.Scanner;

public class Voting_Eligibility {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Age:" );
        int age= sc.nextInt();

        if (age>=18) {
            System.out.println("Voter is Eligible");
        } else {
            System.out.println("Voter is not Eligible");
        }
    }
}
