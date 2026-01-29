package ex_13_Arrays;

public class Lab063__Arrays {
    public static void main(String[] args) {

        int[] arrays = {25, 15, 35, 47, 55, 65, 68, 72, 77, 85};

        //Arrays.sort(arrays);
        //System.out.println(arrays[arrays.length-1]);

        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}