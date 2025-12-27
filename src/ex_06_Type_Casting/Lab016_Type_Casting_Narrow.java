package ex_06_Type_Casting;

public class Lab016_Type_Casting_Narrow {
    public static void main(String[] args) {
        long phone= 8976543210l;
        //short s= phone; //Narrowing Implicit
        short s1= (short) phone; //Narrowing Explicit
        System.out.println(s1);
    }
}
