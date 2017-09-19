package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.C21;

public class C21Test {
    private C21 objectC21;

    @Before
    public void before() {
        objectC21 = new C21();
    }

    @Test
    public void testM1() {
        String expectedResultM1 = "m1";
        assertEquals(expectedResultM1, objectC21.m1());
    }
    
    @Test
    public void testM2() {
        String expectedResultM2 = "m2";
        assertEquals(expectedResultM2, objectC21.m2());
    }

}
