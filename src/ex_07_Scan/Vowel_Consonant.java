package ex_07_Scan;

public class Vowel_Consonant {
    public static void main(String[] args) {
        char ch='c';

        if (ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println("Vowels");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
