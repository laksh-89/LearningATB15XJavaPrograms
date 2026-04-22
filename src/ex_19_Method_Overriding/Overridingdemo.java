package ex_19_Method_Overriding;

class Bank
{
    double roi()
    {
        return 0;
    }
}

class HDFC extends Bank
{
    double roi ()
    {
        return 10.5;
    }
}

class SBI extends Bank
{
    double roi()
    {
        return 11.0;
    }
}
public class Overridingdemo {

    public static void main(String[] args) {

        HDFC hd = new HDFC();
        System.out.println(hd.roi());

        SBI sb = new SBI();
        System.out.println(sb.roi());

    }
}
