package ex_12_String;

public class Lab058_Sb {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }
}
