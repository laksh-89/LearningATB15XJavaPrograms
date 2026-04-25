package ex_23_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Arraylistdemo {
    public static void main(String[] args) {

        ArrayList mylist= new ArrayList();

        //Adding data into the Arraylist
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);

        //Size of arraylist
        System.out.println("Size of an array list:" +mylist.size()); //8

        //Printing arraylist
        System.out.println("Printing data from arraylist:" +mylist); //[100, 10.5, Welcome, A, true, 100, null, null]

        //Remove element from arraylist
        mylist.remove(5); //here 5 is the index of element
        System.out.println("After removing: " +mylist); //[100, 10.5, Welcome, A, true, null, null]

        //Insert element in the arraylist

        mylist.add(2,"java");
        System.out.println("After Insertion:" +mylist); //[100, 10.5, java, Welcome, A, true, null, null]

        //Modify element in the arraylist (modify/replace/change)
        mylist.set(2,"python");
        System.out.println("After replacing: " +mylist); //[100, 10.5, python, Welcome, A, true, null, null]

      /*  //Access specific element from arraylist
        System.out.println(mylist.get(3)); //here 3 is index */

        //Reading all the elements from arraylist

      /*  //Using normal for loop
        for (int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }

        //Using for... each loop

        for (Object x:mylist)
        {
            System.out.println(x);
        } */

        //Using iterator
      //  Iterator it= mylist.iterator();

       // System.out.println(it.next()); // It will return the 1st element of the array list

       /* while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //Checking arraylist is empty or not
        System.out.println("Is arraylist empty? " +mylist.isEmpty()); */

        //Remove all the elements from the arraylist
        ArrayList mylist2 = new ArrayList();

        mylist2.add(100);
        mylist2.add("Welcome");
        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements: " +mylist);

        //Remove all the elements or clear

        mylist.clear();
        System.out.println("Is arraylist empty? " +mylist.isEmpty()); //true




    }
}
