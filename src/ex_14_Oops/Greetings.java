package ex_14_Oops;

public class Greetings {

    // 1) No Parameters ---> No return value

    void m1() {
        System.out.println("Hello....");
    }

    // 2)  No Parameters ---> Return value

    String m2() {
        return ("How are you...??");
    }

    // 3) Takes Parameters ---> No Return value

    void m3 (String name) {

        System.out.println("Hello "+ name );
    }

    // 4) Takes Parameters ---> Return value

    String m4 (String name) {

        return("Hello " + name);


    }


}
