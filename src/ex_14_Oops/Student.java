package ex_14_Oops;

public class Student {

    //Below are the class variables
    int eid;
    String ename;
    char grad;

    public void printdata () {

        System.out.println(eid+ "  " + ename + "   " + grad);
    }

    void setstudentdata (int id, String name, char gr) { //The values in the brackets are local variables or method specific variables and it can access only within it's method.

        eid= id;
        ename = name;
        grad = gr;

    }

    Student (int id, String name, char gr) {

        eid= id;
        ename = name;
        grad = gr;
    }
}
