package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.C31;

public class C31Test {
    private C31 objectC31;

    @Before
    public void before() {
        objectC31 = new C31();
    }

    @Test
    public void testM1() {
        String expectedResultM1 = "m1";
        assertEquals(expectedResultM1, objectC31.m1());
    }
    
    @Test
    public void testM2() {
        String expectedResultM2 = "m2";
        assertEquals(expectedResultM2, objectC31.m2());
    }

}
