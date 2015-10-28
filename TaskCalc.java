

import java.util.Scanner;


public class TaskCalc {


    public int multiplication(int a, int b) {
        int resul = a * b;
        return resul;
    }



    public double division(int a, int b) {
        double temp=a;
        double temp2=b;
        double resul=temp/temp2;
        return resul;
    }



    public int addition(int a, int b) {
        int resul = a + b;
        return resul;
    }

    public int substraction(int a, int b) {
        int resul = a - b;
        return resul;
    }

    public int enterData(String x) {
        int a = 0;
        boolean contains = false;
        do {
            System.out.print("Enter "+x+"= ");
            Scanner cs1 = new Scanner(System.in);
            if (cs1.hasNextInt()) {
                a = cs1.nextInt();
                contains = true;
            } else {
                System.out.println("Error.Please to enter number");
            }
        } while (!contains);
        return a;
    }


    public String enterOperation() {
        String op;
        boolean contains2 = false;
        do {
            System.out.println("Enter operacion (+ - * /) ");
            Scanner cs2 = new Scanner(System.in);
            op = cs2.nextLine();
            if ((op.equals("+")) || (op.equals("-")) || (op.equals("/")) | (op.equals("*"))) {
                contains2 = true;
            } else {
                System.out.println("Error.Please to enter operation");
            }
        } while (!contains2);
        System.out.println();
        return op;
    }
}