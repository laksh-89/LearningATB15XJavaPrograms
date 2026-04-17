package ex_13_Arrays;

public class Search_element {
    public static void main(String[] args) {

        int [] arr= {15, 12, 18, 20, 16, 25, 28, 29, 30};
        int search = 30;
        boolean found = false;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]== search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
