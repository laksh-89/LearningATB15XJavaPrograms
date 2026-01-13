package ex_09_For_loop;

public class Lab035_sumof_num_1_100 {
    public static void main(String[] args) {

        int sum= 0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum=" +sum);
    }
}
