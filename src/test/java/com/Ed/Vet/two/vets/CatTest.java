package com.Ed.Vet.two.vets;

import com.Ed.Vet.two.vets.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CatTest
{
    @Test
    void testGetCatAge()
    {
        Cat testCat = new Cat();
        assertEquals(10, testCat.getAge());
    }

    @Test
    void testGetName()
    {
        Cat testCat1 = new Cat();
        assertEquals("Brandon", testCat1.getNames());
    }

    @Test
    void testGetTalking()
    {
        Cat testCat2 = new Cat();
        assertEquals("Meow", testCat2.getTalking());
    }

}
