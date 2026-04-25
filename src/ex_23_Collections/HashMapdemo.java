package ex_23_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapdemo {
    public static void main(String[] args) {

        //Declaration
        //Map hm = new HashMap();
       // HashMap hm =new HashMap();
        HashMap <Integer,String> hm= new HashMap <Integer,String>();

        //Adding pairs
        hm.put(101, "John");
        hm.put(102, "Scott");
        hm.put(103, "Mary");
        hm.put(104, "Scott");
        hm.put(102, "David");
        System.out.println(hm); //{101=John, 102=David, 103=Mary, 104=Scott}

        //Size of HashMap

        System.out.println("Size of HashMap: " +hm.size()); //4

        //Remove pair

        hm.remove(103); //103 is key of the pair
        System.out.println("After removing pair: " +hm); //After removing pair: {101=John, 102=David, 104=Scott}

        //Retrieve/ Access value of a particular key
        System.out.println(hm.get(102)); //102 is key //David

        //Get all the keys from HashMap
        System.out.println(hm.keySet()); //[101, 102, 104]
        System.out.println(hm.values()); //[John, David, Scott]
        System.out.println(hm.entrySet()); //[101=John, 102=David, 104=Scott]

        //Reading data from HashMap

        //Using for..each loop

       /* for (int k:hm.keySet())
        {
            System.out.println(k+ "   "+hm.get(k));
        } */

        //Using Iterator

       Iterator<Map.Entry<Integer, String>> it=hm.entrySet().iterator();

       while(it.hasNext())
       {
           Map.Entry entry=it.next();
           System.out.println(entry.getKey()+ "     "+entry.getValue());
       }

       //Clear
        hm.clear();
        System.out.println(hm.isEmpty());




    }
}
