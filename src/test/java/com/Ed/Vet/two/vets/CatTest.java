package com.Ed.Vet.two.vets;

import com.Ed.Vet.two.vets.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CatTest
{
    @Test
    void testGetCat()
    {
        Cat testCat = new Cat();
        assertEquals(10, testCat.getAge());

    }
}
