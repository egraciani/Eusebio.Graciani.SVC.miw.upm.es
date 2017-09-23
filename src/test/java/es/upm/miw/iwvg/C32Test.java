package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
    
    private C32 objectC32;

    @Before
    public void before() {
        objectC32 = new C32();
    }

    @Test
    public void testMA() {
        String expectedResultMA = "mA";
        assertEquals(expectedResultMA, objectC32.mA());
    }

}
