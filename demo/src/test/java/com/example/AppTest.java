package com.example;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{   
    @Test
    public void testCalculateAverage(){
        Student std = new Student("Vaishnavi",
                101,
                90,
                80,
                70);

        double actual = GradeCalculator.calculateAverage(std);

        assertEquals(80.0, actual, 0.001 );
    }
}
