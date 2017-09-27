package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

    private C51 objectC51;

    @Before
    public void before() {
        objectC51 = new C51();
    }

    @Test
    public void testM1() {
        String expectedResultM1 = "m1";
        assertEquals(expectedResultM1, objectC51.m1());
    }
    
    @Test
    public void testM2() {
        String expectedResultM2 = "m2";
        assertEquals(expectedResultM2, objectC51.m2());
    }
}
