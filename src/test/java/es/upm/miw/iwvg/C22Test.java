package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.C22;

public class C22Test {
    
    private C22 objectC22;

    @Before
    public void before() {
        objectC22 = new C22();
    }

    @Test
    public void testMA() {
        String expectedResultMA = "mA";
        assertEquals(expectedResultMA, objectC22.mA());
    }

}
