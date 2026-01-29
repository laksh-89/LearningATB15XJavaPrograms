package ex_12_String;

public class Lab057_SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World ");
        sb.reverse();
        System.out.println(sb);

    }
}
