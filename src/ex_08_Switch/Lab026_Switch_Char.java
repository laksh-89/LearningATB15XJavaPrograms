package ex_08_Switch;

public class Lab026_Switch_Char {
    public static void main(String[] args) {
        char ch= 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
