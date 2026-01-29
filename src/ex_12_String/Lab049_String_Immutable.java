package ex_12_String;

public class Lab049_String_Immutable {
    public static void main(String[] args) {
        String name = "Laksh";
      //  boolean result= name.contains("L");
       // System.out.println(result);

        name.toUpperCase();
        name= name.toUpperCase();
        System.out.println(name);

    }
}
