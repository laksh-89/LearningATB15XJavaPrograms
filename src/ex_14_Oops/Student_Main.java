package ex_14_Oops;

public class Student_Main {

   public static void main(String[] args) {

      // Student stu = new Student();
     /*  stu.eid= 001;
       stu.ename= "Ron";
       stu.grad= 'A';
        */


       //using method
       /* stu.setstudentdata(101, "Ron", 'A');
       stu.printdata(); */

       // Constructor
       Student stu = new Student(101, "Ron", 'A');
       stu.printdata();


    }
}
