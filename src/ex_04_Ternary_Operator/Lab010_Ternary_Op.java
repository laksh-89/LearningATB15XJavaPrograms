package ex_04_Ternary_Operator;

public class Lab010_Ternary_Op {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int maxvalue=(n1>n2? n1:((n2>n3)?n2:n3));
        System.out.println("The maxvalue is:" +maxvalue);
    }
}
