package ex_12_String;

public class Lab053_String_example {
    public static void main(String[] args) {
        /*String s= "java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "abc".compareTo("ABC");
        int result1 = "ABC".compareTo("ABC");
        int result2 = "abc".compareTo("abc");
        int result3 = "ABC".compareTo("abc");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);*/

        int idx= "Java".indexOf("v");
        System.out.println(idx);

        int idx1 = "Java".lastIndexOf("a");
        System.out.println(idx1);

        boolean b = "".isEmpty();
        System.out.println(b);

        String string1= String.join("*" , "Java" , "Python");
        System.out.println(string1);

        String s2 = "Java".replace('a', 'o');
        System.out.println(s2);

        boolean b1= "Java".startsWith("Ja");
        System.out.println(b1);

        String b2 = "Java".concat("Mava");
        System.out.println(b2);
    }
}
