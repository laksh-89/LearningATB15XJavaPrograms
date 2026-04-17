package ex_17_this_keyword;

public class ThisKeyword {

    int x,y; //class variables or instance variables

    /*ThisKeyword (int a, int b)
    {
        x=a;
        y=b;
    }*/

   /* ThisKeyword (int x, int y) //This is a constructor
    {
        this.x=x;
        this.y=y;
    }
*/

    void setdata (int a, int b) //This is called user defined Method
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args)
    {
       // ThisKeyword th = new ThisKeyword(100,200);
        ThisKeyword th = new ThisKeyword();
        th.setdata(100,200);
        th.display();


    }
}
