package ex_02_Java_Basics;

import com.sun.jdi.connect.Connector;

public class Lab023_Scanner {
    public static void main(String[] args) {
        String age_input_string= args [0];
        System.out.println(age_input_string instanceof String);
        int age_user_input= Integer.parseInt(age_input_string);

        String result= (age_user_input<18) ? "Minor" : (age_user_input<=60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);


    }
}
