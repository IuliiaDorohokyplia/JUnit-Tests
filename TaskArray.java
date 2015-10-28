

import java.util.Arrays;

import java.util.ArrayList;

public class TaskArray {
    public void outArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }

/*1.	task1. */

    public int[] task1(int[] array) {

        ArrayList<Integer> arrayNeg = new ArrayList<Integer>();
        ArrayList<Integer> arrayPos = new ArrayList<Integer>();


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arrayNeg.add(array[i]);
            }
            if (array[i] > 0) {
                arrayPos.add(array[i]);
            }
        }
        if ((arrayNeg.size()==0)||(arrayPos.size()==0)){
            //System.out.println("no elements for exchange");
            //System.out.println("task1= "+Arrays.toString(array));
        }else {
        int maxNeg = arrayNeg.get(0);
        int maxNegIndex = 0;
        for (int i = 1; i < arrayNeg.size(); i++) {
            if (maxNeg < arrayNeg.get(i)) {
                maxNeg = arrayNeg.get(i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNeg) {
                maxNegIndex = i;
                break;
            }
        }
/////////////////////////////////
        int minPos = arrayPos.get(0);
        int minPosIndex = 0;

        for (int i = 1; i < arrayPos.size(); i++) {
            if (minPos > arrayPos.get(i)) {
                minPos = arrayPos.get(i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minPos) {
                minPosIndex = i;
                break;
            }
        }
        array[maxNegIndex] = minPos;
        array[minPosIndex] = maxNeg;
        }
        return array;
    }


    /*2.	task2 .*/
    public int task2(int[] array) {
        int max = 0;
        int k = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                max = max + array[i];
            }
        }
        return max;
    }


    /*3.	task3 .*/
    public int[] task3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    /*4. task4 	 */
    public int[] task4(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > 0) && (array[i + 1] < 0)) {
                array[i] = array[i] * 3;
            } else {
                array[i] = array[i];
            }
        }
        return array;
    }

    /*5. task 5 .*/
    public double task5(int[] array) {
        double max = 0;

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            max = max + array[i];
            k++;
        }
        max = max / k;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        double result = max - min;
        return result;
    }

    /*6.task 6*/

    public int[] task6(int[] array) {
        System.out.println();
        int n = 0;
        ArrayList<Integer> arrayTemp = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if ((array[i] == array[j]) && (i % 2 != 0) && (!arrayTemp.contains(array[i]))) {
                    arrayTemp.add(array[i]);
                }
            }
        }
            n = arrayTemp.size();
            int arrayRand[] = new int[n];
            for (int i=0;i<arrayRand.length;i++) {
                arrayRand[i]=arrayTemp.get(i);
            }
        return arrayRand;
    }
}



