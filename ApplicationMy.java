import java.util.Arrays;
import java.util.Scanner;

public class ApplicationMy {

    /* Function calls start each task

    */
    public static void main(String[] args) {
        ApplicationMy app = new ApplicationMy();


        //all tasks are now open
        //comment out those tasks that do not need run

       // app.startApplication1();  //Function calls start  task 1
        app.startApplication2(); //Function calls start  task 2
        //app.startApplication3(); //Function calls start  task 2
    }



/*1	.*/

    public void startApplication1() {  //task1 - use  class TaskArray.java- all methods are there
        TaskArray one =new TaskArray();
        int min = -10;
        int max = 10;
        int n=5;
        int arrayRand[] = new int[n];

        for (int i = 0; i < arrayRand.length; i++) {
            arrayRand[i] = min + (int) (Math.random() * ((max - min) + 1));
            System.out.print(arrayRand[i] + " ");
        }


        //all tasks are now open
        //comment out those tasks that do not need run


   //     System.out.println("task1= "+Arrays.toString(one.task1(arrayRand)));
//        System.out.println("task2= "+one.task2(arrayRand));
//        System.out.println("task3= "+Arrays.toString(one.task3(arrayRand)));
//        System.out.println("task4= "+Arrays.toString(one.task4(arrayRand)));
   //System.out.println("task5= "+one.task5(arrayRand));


       // System.out.println("task6= "+Arrays.toString(one.task6(arrayRand)));


    }

    /*2.*/
    public void startApplication2() {//task2 - use  class TaskString.java- all methods are there
        TaskString two =new TaskString();
        int n;
        n= two.enterN();
        Scanner cs1 = new Scanner(System.in);
        String ArrayRows[] = new String[n];
        for (int i = 0; i < ArrayRows.length; i++) {
            ArrayRows[i] = cs1.nextLine();
        }

        //all tasks are now open
        //comment out those tasks that do not need run

        two.print(two.task1(ArrayRows));
        //two.print(two.task2(ArrayRows));
        //two.print(two.task3(ArrayRows));
       // System.out.println("task6- "+two.task6(ArrayRows));

    }
    /*3	.*/

    public void startApplication3() { //task3 - use  class TaskCalc.java- all methods are there
        TaskCalc three =new TaskCalc();

        int a=three.enterData("A");
        String op=three.enterOperation(); //Operation
        int b=three.enterData("B");


        if (op.equals("+")) {
            System.out.println(three.addition(a, b));
        }
        if (op.equals("-")) {
            System.out.println(three.substraction(a, b));
        }
        if (op.equals("*")) {
            System.out.println(three.multiplication(a, b));

        }
        if (op.equals("/")) {
            System.out.println(three.division(a, b));
        }

    }
}