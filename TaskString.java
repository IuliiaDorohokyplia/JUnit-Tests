
//function for task 2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



    public class TaskString {




    /*1.Task 1 -*/

    public String[] task1(String [] arrayRows) {

        String[] result = new String[2];
        if ((minString(arrayRows)!=null)||(maxString(arrayRows)!=null)){
        result[0]=minString(arrayRows);
        result[1]=maxString(arrayRows);}
        return result;
    }


    /*2.	Task 2 - */

    public String[] task2(String [] arrayRows) {

        ArrayList<String> arrayNunber = new ArrayList<String>();
        int middle= middleStringLength(arrayRows);
        for (int i = 0; i < arrayRows.length; i++) {
            if (arrayRows[i].length()>middle){
                arrayNunber.add(arrayRows[i]);
            }
        }

        int n;
        n = arrayNunber.size();
        String arraynext[] = new String[n];
        for (int i=0;i<arraynext.length;i++) {
            arraynext[i]=arrayNunber.get(i);
        }


        return arraynext;
    }

/*3.	Task 3 */

    public String[] task3(String [] arrayRows) {

        ArrayList<String> arrayNunber = new ArrayList<String>();
        int middle= middleStringLength(arrayRows);
        for (int i = 0; i < arrayRows.length; i++) {
            if (arrayRows[i].length()<middle){
                arrayNunber.add(arrayRows[i]);
            }
        }

        int n;
        n = arrayNunber.size();
        String arraynext[] = new String[n];
        for (int i=0;i<arraynext.length;i++) {
            arraynext[i]=arrayNunber.get(i);
        }

        return arraynext;

    }

    /*6. Task 	*/
    public String task6(String [] arrayRows) {
        String result=null;

        ArrayList<String> arrayNunber = new ArrayList<String>();
        Pattern p = Pattern.compile(("\\d{0,}"));
        Matcher mut = null;
        for (int i = 0; i < arrayRows.length; i++) {
            mut = p.matcher(arrayRows[i]);
            if (mut.matches()) {
                arrayNunber.add(arrayRows[i]);
            }
        }
        //System.out.println();
        if (arrayNunber.size()>1){
            result=arrayNunber.get(1);
           // System.out.println(arrayNunber.get(1));
        }if (arrayNunber.size()==1) {
            result=arrayNunber.get(0);}
        if (arrayNunber.size()==0){
            result="NO STRING";

        }

        return result;
    }



    // enten nunbers of rows
    public int enterN() {
        int n = 0;
        boolean contains = false;
        do {
            System.out.print("Enter number of rows n=");
            Scanner cs = new Scanner(System.in);
            if (cs.hasNextInt()) {
                n = cs.nextInt();
                contains = true;
            } else {
                System.out.println("Error.Please to enter number");
            }
        } while (!contains);
        return n;
    }




    //find min string
    public String minString(String[] arrayRows) {
        String minRows = arrayRows[0];

        for (int i = 1; i < arrayRows.length; i++) {
            if (minRows.length() > arrayRows[i].length()) {
                minRows = arrayRows[i];
            }
        }
        return minRows;
    }

    //find max string
    public String maxString(String[] arrayRows) {
        String maxRows = arrayRows[0];

        for (int i = 1; i < arrayRows.length; i++) {
            if (maxRows.length() < arrayRows[i].length()) {
                maxRows = arrayRows[i];
            }
        }
        return maxRows;
    }



    //find middle string
    public int middleStringLength(String[] arrayRows) {
        int max=0;
        for (int i = 0; i < arrayRows.length; i++){
            max=max+arrayRows[i].length();
        }
        int middle=max/arrayRows.length;
        return middle;
    }


        public void print (String [] arrayRows) {
            for (int i=0;i<arrayRows.length;i++){
                System.out.print("'" + arrayRows[i] + "'-" + arrayRows[i].length());
            }
        }



}
