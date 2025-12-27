package ex_03_Literals;

public class Lab_literals {
    public static void main(String[] args) {
        char c1='A';
        char c2='B';
        System.out.println(c1);
        System.out.println(c2);

        char c3='@';
        char c4= '_';
        char c5= '9';
        char c6= '1';
        char c7= '(';
        char c8= ' '; //Blank space

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Laksh Verma");
        System.out.println("Laksh" +new_line+"Verma");
        System.out.println("Laksh" +tab_line+"Verma");
        System.out.println("Laksh" +back_space+ "Verma");
        System.out.println("Laksh" +carriage_return+"Verma");

    }
}
