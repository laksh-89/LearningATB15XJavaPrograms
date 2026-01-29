package ex_11_Do_While;

public class Lab048_Password_retry_simulation {
    public static void main(String[] args) {

        int attempts= 1;

        do {
            System.out.println(" attempts " + attempts );
            attempts++;
        } while (attempts<=3);
        System.out.println("Account locked");
    }
}
