package es.upm.miw.SVC.Magjistari.MiguelArber.C1;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.SVC.Magjistari.MiguelArber.C1.C12;


public class C12Test {
	
	private C12 c12;
	
    @Before
    public void before() {
        c12 = new C12();
    }
    
    @Test
    public void testMA() {
        assertEquals("mA", c12.mA());
    }

}