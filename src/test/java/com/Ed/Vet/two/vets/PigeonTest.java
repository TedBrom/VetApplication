package com.Ed.Vet.two.vets;

import com.Ed.Vet.two.vets.FlyingRat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigeonTest
{
    @Test
    void testGetPigeAge()
    {
        FlyingRat testPige = new FlyingRat();
        assertEquals(2, testPige.getAge());
    }
    @Test
    void testGetPigeName()
    {
        FlyingRat testPige1 = new FlyingRat();
        assertEquals("Matej", testPige1.getNames());
    }
    @Test
    void testGetCall()
    {
        FlyingRat testPige2 = new FlyingRat();
        assertEquals("Squawk", testPige2.getCall());
    }
    @Test
    void testGetLifeStatus()
    {
        FlyingRat testPige3 = new FlyingRat();
        assertEquals(false, testPige3.isDead());
    }
    @Test
    void testGetColour()
    {
        FlyingRat testPige4 = new FlyingRat();
        assertEquals("Blue", testPige4.getColour());
    }
    @Test
    void getFlying()
    {
        FlyingRat testPige5 = new FlyingRat();
        assertEquals(true, testPige5.takeOff());
    }
    @Test
    void getFlapping()
    {
        FlyingRat testPige6 = new FlyingRat();
        assertEquals(true, testPige6.flap());
    }
    @Test
    void getLand()
    {
        FlyingRat testPige7 = new FlyingRat();
        assertEquals(true, testPige7.landing());
    }
}
