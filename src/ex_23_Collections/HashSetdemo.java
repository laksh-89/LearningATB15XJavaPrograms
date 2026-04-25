package ex_23_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetdemo {
    public static void main(String[] args) {

        //Declaration

          HashSet myset= new HashSet();
        //Set myset = new HashSet();
        //HashSet <String> myset= new HashSet <String>();

        //Add elements into HashSet
        myset.add(100);
        myset.add(10.5);
        myset.add("Welcome");
        myset.add(true);
        myset.add('A');
        myset.add(100);
        myset.add(null);
        myset.add(null);

        //Print HashSet
        System.out.println(myset); //[null, A, 100, 10.5, Welcome, true]

        //Size of an HashSet
        System.out.println("Size of HashSet: " +myset.size()); //6

        //Removing element
        myset.remove(10.5); //10.5 is a value (not an index)
        System.out.println("After removing: " +myset);

        //Inserting element - Not possible in HashSet
        //Access specific element - Not possible

        //Convert HashSet---> Arraylist
        ArrayList al= new ArrayList(myset);
        System.out.println(al.get(2));

      /*  //Read all the elements using for..each loop
        for (Object x:myset)
        {
            System.out.println(x);
        } */

      /*  Iterator it =myset.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        } */

        //Clearing all the elements in HashSet
        myset.clear();
        System.out.println(myset.isEmpty());


    }
}
