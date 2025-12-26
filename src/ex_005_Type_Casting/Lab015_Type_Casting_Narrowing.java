package ex_005_Type_Casting;

public class Lab015_Type_Casting_Narrowing {
    public static void main(String[] args) {
        int val=300;
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0
        //byte b= val; // Imlicit Narrowing This is not possible
        byte b2= (byte) val; // Explicit Narrowing
        System.out.println(b2);
        // 0 0 1 0 1 1 0, // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44
    }
}
