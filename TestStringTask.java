import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * Created by luchik on 21.09.15.
 */
public class TestStringTask {
    TaskString t2 = new TaskString ();

    @Test
    public void testTask1() {

        assertArrayEquals(new String[]{"s","father"}, t2.task1(new String[]{"cat", "open", "father", "s", "fa"}));
        assertArrayEquals(new String[]{"a","mother"}, t2.task1(new String[]{"My", "mother", "like", "a", "cats"}));
        assertArrayEquals(new String[]{"my","my"}, t2.task1(new String[]{"my", "my", "my"}));
        System.out.println("testTask1String ok");

    }

    @Test
    public void testTask2() {

        assertArrayEquals(new String[]{"open", "father"}, t2.task2(new String[]{"cat", "open", "father", "s", "fa"}));
        assertArrayEquals(new String[]{"mother","like","cats"}, t2.task2(new String[]{"My", "mother","like", "a", "cats"}));
        System.out.println("testTask2String ok");
    }

    @Test

    public void testTask3() {

        assertArrayEquals(new String[]{"s","fa"}, t2.task3(new String[]{"cat", "open", "father", "s", "fa"}));
        assertArrayEquals(new String[]{"My", "a"}, t2.task3(new String[]{"My", "mother","like", "a", "cats"}));
        System.out.println("testTask3String ok");
    }

    @Test
    public void testTask6() {

        assertEquals("6", t2.task6(new String[]{"-1hjj", "6hj", "7888", "-7h", "hj5", "6"}));
        assertEquals("54", t2.task6(new String[]{"5454", "54", "7888", "-7h", "hj5", "6"}));
        System.out.println("testTask6String ok");
    }

    @Test
    public void maxString() {

        String [] m2 = {"-1hjjfdfdf", "6hj", "7888", "-7h", "hj5", "6"};
        assertEquals("-1hjjfdfdf", t2.maxString(new String[]{"-1hjjfdfdf", "6hj", "7888", "-7h", "hj5", "6"}));
        System.out.println("testMaxString ok");
    }

    @Test
    public void minString() {

        assertEquals("y", t2.minString(new String[]{"-1hjj","6hj","y","7888","-7h","hj5","6"}));
        System.out.println("testMinString ok");
    }

    @Test
    public void middleStringLength() {

        assertEquals(3, t2.middleStringLength(new String[]{"-1hjj", "6hj", "7888", "-7h", "hj5", "6"}));
        System.out.println("testmiddleStringLength ok");
    }

}
