package es.upm.miw.SVC.Magjistari.MiguelArber.C3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.SVC.Magjistari.MiguelArber.C3.C32;


public class C32Test {
	
	private C32 c32;
	
    @Before
    public void before() {
        c32 = new C32();
    }
    
    @Test
    public void testMA() {
        assertEquals("mA", c32.mA());
    }

}