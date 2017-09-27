package es.upm.miw.iwvg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
  
    private C52 objectC52;

    @Before
    public void before() {
        objectC52 = new C52();
    }

    @Test
    public void testMA() {
        String expectedResultMA = "mA";
            assertEquals(expectedResultMA, objectC52.mA());
    }
    
}
