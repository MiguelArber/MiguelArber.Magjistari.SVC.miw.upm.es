package es.upm.miw.SVC.Magjistari.MiguelArber.C2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.SVC.Magjistari.MiguelArber.C2.C21;


public class C21Test {
	
	private C21 c21;
	
    @Before
    public void before() {
        c21 = new C21();
    }
    
    @Test
    public void testM1() {
        assertEquals("m1", c21.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("m2", c21.m2());
    }
    
    @Test
    public void testM3() {
        assertEquals("m3", c21.m3());
    }

}
