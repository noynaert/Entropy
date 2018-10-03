package edu.missouriwestern.noynaert.csc254;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EntropyTest
{
    static final double DELTA = 0.000001;
    static String[] argsA = {"abc.txt"};
    static String[] argsB = {"abc", "def"};
    static String[] argsC = {};
    static String[] argsD = {"123.txt", "abc"};



    @Test
    public void log10() {
        assertEquals(3.0, Entropy.log10(1000.0),DELTA);
        assertEquals(2.0, Entropy.log10(100.0),DELTA);
        assertEquals(1.0, Entropy.log10(10), DELTA);
        assertEquals(0.0, Entropy.log10(1), DELTA);
        assertEquals(-1.0, Entropy.log10(0.1), DELTA);
        assertEquals(-2.0, Entropy.log10(0.01), DELTA);
        assertEquals(-3.0, Entropy.log10(0.001), DELTA);
        assertEquals(.30102999566, Entropy.log10(2.0), DELTA);
        assertEquals(.30102999566, Entropy.log10(22.0), DELTA);

        assertEquals(1.50514997, Entropy.log10(32.0),DELTA);
        assertEquals(0.17609125, Entropy.log10(1.5), DELTA);
        assertEquals(-.30102999, Entropy.log10(0.5), DELTA);
        //Note these last 3 tests
        assertEquals(0.497149506, Entropy.log10(Math.PI), DELTA);
        assertEquals(Double.NEGATIVE_INFINITY, Entropy.log10(0), DELTA);
        assertEquals(Double.NaN, Entropy.log10(-10), DELTA);
        assertEquals(Double.POSITIVE_INFINITY , Entropy.log10(-0.100), DELTA);

    }
    @Test
    public void getFileNameFromArgs(){
        assertEquals("abc.txt", Entropy.getFileNameFromArgs(argsA));
        assertEquals("abc", Entropy.getFileNameFromArgs(argsB));
        assertEquals("input.txt", Entropy.getFileNameFromArgs(argsC));
        assertEquals("123", Entropy.getFileNameFromArgs(argsD));

    }
}
