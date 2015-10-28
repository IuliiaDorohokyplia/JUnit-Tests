import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
/**
 * Created by luchik on 20.09.15.
 */
public class TestArrayTask {
    TaskArray t = new TaskArray();
    private static final double DELTA = 0.001;

    @Test
    public void testtask1() {
        assertArrayEquals(new int[]{0,-5,-2,0,5,0}, t.task1(new int[]{0,-5,5,0,-2,0}));
        assertArrayEquals(new int[]{-7,-8,-8,-9}, t.task1(new int[]{-7,-8,-8,-9}));
        assertArrayEquals(new int[]{-6,8,9,3}, t.task1(new int[]{3,8,9,-6}));

        System.out.println("testTask1Array ok");

    }

    @Test
    public void testtask2() {
        assertEquals(12, t.task2(new int[]{5, 6, 7}));
        assertEquals(0, t.task2(new int[]{0, 0, 0, 0, 0}));
        assertEquals(10, t.task2(new int[]{3, 1, 7}));
        assertEquals(0, t.task2(new int[]{}));
        System.out.println("testTask2Array ok");
    }

    @Test
    public void testtask3() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, t.task3(new int[]{0, 0, 0, 0, 0, 0}));
        assertArrayEquals(new int[]{5, 6, 7, 7, 1, 6}, t.task3(new int[]{5, 6, 7, 7, 1, 6}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, t.task3(new int[]{-5, -6, -7, -7, -1, -6}));
        assertArrayEquals(new int[]{}, t.task3(new int[]{}));
        System.out.println("testTask3Array ok");
    }

    @Test
    public void testtask4() {
        assertArrayEquals(new int[]{5, 6, 21, -7, 3, -6}, t.task4(new int[]{5, 6, 7, -7, 1, -6}));
        assertArrayEquals(new int[]{5, 6, 7, 7, 1, 6}, t.task4(new int[]{5, 6, 7, 7, 1, 6}));
        assertArrayEquals(new int[]{-5, -6, -7, -7, -1, -6}, t.task4(new int[]{-5, -6, -7, -7, -1, -6}));
        assertArrayEquals(new int[]{}, t.task4(new int[]{}));
        System.out.println("testTask4Array ok");
    }

    @Test
    public void testtask5() {
        assertEquals(5.66666, t.task5(new int[]{0, -4, 1, -9, -2, -6}), DELTA);
        assertEquals(0.0, t.task5(new int[]{0, 0, 0, 0, 0, 0}), DELTA);
        assertEquals(2.0, t.task5(new int[]{5,6,7,10}), DELTA);
        System.out.println("testTask5Array ok");
    }


    @Test
    public void testtask6() {
        assertArrayEquals(new int[]{-9,-6,2}, t.task6(new int[]{9,-9,-1,-6,-7,7,0,3,-2,0,-9,-4,-6,2,-5,-3,4,2,2,-6}));
        assertArrayEquals(new int[]{}, t.task6(new int[]{6,2,-5,-3,4,-6}));
        assertArrayEquals(new int[]{}, t.task6(new int[]{5,2,5,3,1}));
        System.out.println("testTask6Array ok");
    }
}