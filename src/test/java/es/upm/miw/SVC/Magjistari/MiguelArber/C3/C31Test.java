package es.upm.miw.SVC.Magjistari.MiguelArber.C3;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.SVC.Magjistari.MiguelArber.C3.C31;

public class C31Test {
	
	private C31 c31;
	
    @Before
    public void before() {
        c31 = new C31();
    }
    
    @Test
    public void testM1() {
        assertEquals("m1", c31.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("m2", c31.m2());
    }
    
    @Test
    public void testMB() {
        assertEquals("mB", c31.mB());
    }
    
}
