import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by luchik on 21.09.15.
 */
public class TestCalcTask {
    TaskCalc t = new TaskCalc();
    private static final double DELTA = 0.001;

    @Test
    public void testMultiplication() {

        assertEquals(4, t.multiplication(2, 2),DELTA);
        assertEquals(0, t.multiplication(2, 0),DELTA);
        assertEquals(-6, t.multiplication(2, -3),DELTA);
        assertEquals(42, t.multiplication(-6, -7),DELTA);
        System.out.println("testMultiplication ok");
    }
    @Test
    public void testAddition() {

        assertEquals(4, t.addition(2, 2),DELTA);
        assertEquals(0, t.addition(-2, 2),DELTA);
        assertEquals(-9, t.addition(-2, -7),DELTA);
        assertEquals(0, t.addition(0, 0),DELTA);
        System.out.println("testAddition ok");
    }
    @Test
    public void testSubstraction() {

        assertEquals(0, t.substraction(2, 2),DELTA);
        assertEquals(3, t.substraction(5, 2),DELTA);
        assertEquals(4, t.substraction(-2, -6),DELTA);
        assertEquals(0, t.substraction(0, 0),DELTA);
        System.out.println("testSubstraction ok");
    }
    @Test
    public void testDivision() {

        assertEquals(1, t.division(2, 2),DELTA);
        assertEquals(3, t.division(6, 2),DELTA);
        assertEquals(0.5, t.division(2, 4),DELTA);
    }
}
