package es.upm.miw.SVC.Magjistari.MiguelArber.C1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.SVC.Magjistari.MiguelArber.C1.C11;


public class C11Test {
	
	private C11 c11;
	
    @Before
    public void before() {
        c11 = new C11();
    }
    
    @Test
    public void testM1() {
        assertEquals("m1", c11.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("m2", c11.m2());
    }

}