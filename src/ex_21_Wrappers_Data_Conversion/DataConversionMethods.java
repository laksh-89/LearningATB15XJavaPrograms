package ex_21_Wrappers_Data_Conversion;

public class DataConversionMethods {

    public static void main(String[] args) {

        // 1) String---> Int

        /*String s1="10";
        String s2="20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/

      /*  //2) String---> double
        String s1= "10.5";
        String s2= "20.0";

        System.out.println(Double.parseDouble(s1)+ Double.parseDouble(s2));*/

       // 3) String ---> Boolean

      //  String s1= "true"; //Other than true, if you pass any string that will be false
       // System.out.println(Boolean.parseBoolean(s1));

        // int, double, boolean, char ---> String

        int a=10;
        double d= 10.5;
        char c= 'A';
        Boolean bool = true;

        //String.valueOf() -->convert all primitive data type into string format

        String s= String.valueOf(a);
        System.out.println(a);

        s = String.valueOf(d);
        System.out.println(s);

        s =String.valueOf(c);
        System.out.println(s);

        s= String.valueOf(bool);
        System.out.println(s);


    }
}
