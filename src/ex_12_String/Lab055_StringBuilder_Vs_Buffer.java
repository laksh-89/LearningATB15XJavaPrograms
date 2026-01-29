package ex_12_String;

public class Lab055_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0= "Laksh";
        String s1= new String("Laksh");

        StringBuffer stringbuffer = new StringBuffer("Laksh");
        StringBuilder stringbuilder = new StringBuilder("Laksh");

        System.out.println(stringbuffer.reverse());
        System.out.println(stringbuilder.reverse());
    }
}
