package ex_13_Arrays;

public class Lab061_Arrays {
    public static void main(String[] args) {
         int a= 10;
         int marks[] = {90, 91, 92, 94, 95, 96,98};
        int[] marks2 = {90, 91, 92, 94, 95, 96,98};

        boolean [] is_married_people = {true, false};
        String [] names = {"Laksh", "Nikhil"};
        // Not allowed String [] names = {"Laksh", 32};

        float [] values = new float[3];
        values [0]= 3.14f;
        values [1]= 4.14f;
        values [2]= 5.14f;
        //index= 0,1,2

        for (String name: names){
            System.out.println(name);
        }
    }
}
