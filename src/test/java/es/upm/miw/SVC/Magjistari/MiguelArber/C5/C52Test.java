package es.upm.miw.SVC.Magjistari.MiguelArber.C5;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.SVC.Magjistari.MiguelArber.C5.C52;


public class C52Test {
	
	private C52 c52;
	
    @Before
    public void before() {
        c52 = new C52();
    }
    
    @Test
    public void testMA() {
        assertEquals("mA", c52.mA());
    }

}