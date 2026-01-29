package ex_12_String;

public class Lab054_Strings {
    public static void main(String[] args) {
        CharSequence s = "Laksh";
        System.out.println(s);
        System.out.println(s.subSequence(1,4));

        String s1 = "Java".substring(1);
        System.out.println(s1);

        char[] arr =  "Java".toCharArray();
        System.out.println(arr);

        boolean b= " ".isBlank();
        System.out.println(b);

        String s2 = "ab".repeat(5);
        System.out.println(s2);

        boolean b1 = "Java".equalsIgnoreCase("Java");
        System.out.println(b1);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
        System.out.println("=".repeat(40));
        System.out.println("Here is the beautiful output");
        System.out.println("=".repeat(40));
    }
}
