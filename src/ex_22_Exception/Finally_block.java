package ex_22_Exception;

public class Finally_block {

    public static void main(String[] args) {

        System.out.println("Program is Started...");

        String s= "welcome";

        try
        {
            System.out.println(s.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Catch block Handled Exception....");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("You enter into the finally block");
        }


        System.out.println("Program is Finisted...");
    }
}

