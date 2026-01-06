package ex_08_Switch;

public class Lab028_calculator_using_switch {
    public static void main(String[] args) {

        int a=10; int b=5;
        char operator = '*';

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
