package ex_15_Polymorphism;

public class Box {

    double width, height, depth;

    Box()
    {
        width=height=depth=10;
    }

    Box(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box(double len)
    {
        width=height=depth=len;
    }
    double volume ()
    {
        return (width*height*depth);
    }
}
