package ex_08_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab025_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = sc.next();
        browser=browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Starting the edge");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I have no idea which browser is this");


        }
    }
}
