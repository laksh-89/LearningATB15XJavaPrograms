package ex_11_Do_While;

public class Lab047Menu_driven_program {
    public static void main(String[] args) {
        int choice = 1;

        do {
            System.out.println("1.Login test");
            System.out.println("2.Logout test");
            System.out.println("3.Exit");
            choice++;
        } while(choice<=3);
    }
}