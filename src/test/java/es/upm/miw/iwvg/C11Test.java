package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.C11;

public class C11Test {
    
    private C11 objectC11;

    @Before
    public void before() {
        objectC11 = new C11();
    }

    @Test
    public void testM1() {
        String expectedResultM1 = "m1";
        assertEquals(expectedResultM1, objectC11.m1());
    }
    
    @Test
    public void testM2() {
        String expectedResultM2 = "m2";
        assertEquals(expectedResultM2, objectC11.m2());
    }

}
