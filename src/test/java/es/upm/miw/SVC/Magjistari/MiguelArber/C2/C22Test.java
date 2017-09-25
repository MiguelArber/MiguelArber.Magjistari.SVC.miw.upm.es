package es.upm.miw.SVC.Magjistari.MiguelArber.C2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.SVC.Magjistari.MiguelArber.C2.C22;


public class C22Test {
	
	private C22 c22;
	
    @Before
    public void before() {
        c22 = new C22();
    }
    
    @Test
    public void testMA() {
        assertEquals("mA", c22.mA());
    }


}
