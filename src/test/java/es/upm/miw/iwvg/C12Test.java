package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.C12;

public class C12Test {
    
    private C12 objectC12;

    @Before
    public void before() {
        objectC12 = new C12();
    }

    @Test
    public void testM1() {
        String expectedResultMA = "mA";
        assertEquals(expectedResultMA, objectC12.mA());
    }

}
