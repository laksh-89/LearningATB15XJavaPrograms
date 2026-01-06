package ex_08_Switch;

public class Lab030_MonthNum_Num_of_days {
    public static void main(String[] args) {

        int month =12;
        switch (month) {
            case 1: case 3: case 7:
            case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
