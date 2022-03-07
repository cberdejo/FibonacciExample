import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test cases:
 * fibonacci 0 -> 0
 * fibonacci 1 -> 1
 * fibonacci 2 -> 1
 * fibonacci 3 -> 2
 * fibonacci 4 ->3
 * fibonacci 8 -> 21
 *fibonacci negative number
 */
class FibonacciTest {
    private Fibonacci fibonacci;
    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @AfterEach
    public void finish(){
        fibonacci = null;
    }
    @Test
    public void testFibonacci0(){
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue,obtainedValue); //JUnit
    }

    @Test
    public void testFibonacci1(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtainedValue); //JUnit
    }
    @Test
    public void testFibonacci2(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue,obtainedValue); //JUnit
    }
    @Test
    public void testFibonacci3(){
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue,obtainedValue); //JUnit
    }
    @Test
    public void testFibonacci4(){
        int expectedValue = 3;
        int obtainedValue = fibonacci.compute(4);

        assertEquals(expectedValue,obtainedValue); //JUnit
    }
    @Test
    public void testFibonacci8(){
        int expectedValue = 21;
        int obtainedValue = fibonacci.compute(8);

        assertEquals(expectedValue,obtainedValue); //JUnit
    }
    @Test
    public void testFibonacciNegativeNumber(){
        Random rd = new Random();

        int i = rd.nextInt();
        while (i >= 0){
            i = rd.nextInt();
        }

        int value = i;
        assertThrows(RuntimeException.class, ()->fibonacci.compute(value)); //JUnit
    }
}