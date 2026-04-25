package ex_22_Exception;

public class Checked_Exceptions {
    public static void main(String[] args) {

        System.out.println("Program Started.....");
        System.out.println("Program in progress");

    try
    {
        Thread.sleep(5000);
    }
    catch (InterruptedException e)
    {
    }
        System.out.println("Program Finished...");
        System.out.println("Program exited...");
    }
}
