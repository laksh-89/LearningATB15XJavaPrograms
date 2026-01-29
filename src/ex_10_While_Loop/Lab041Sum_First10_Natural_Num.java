package ex_10_While_Loop;

public class Lab041Sum_First10_Natural_Num {
    public static void main(String[] args) {

        int i=1, sum=0;
        while (i<=10) {
            sum+=i;
            i++;
        }
        System.out.println("Sum = "  +sum);
    }
}
