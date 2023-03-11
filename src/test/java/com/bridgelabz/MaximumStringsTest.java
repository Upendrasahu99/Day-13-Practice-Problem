package com.bridgelabz;

import org.junit.Test;

import static com.bridgelabz.MaximumStrings.findMax;
import static org.junit.Assert.*;

public class MaximumStringsTest {
    @Test
    public void testFirstPosition() {
      assertEquals("Roy",findMax("Roy","John","Harry"));
    }
@Test
    public void testSecondPosition(){

        assertEquals("Roy",findMax("John","Roy","Harry"));
}
@Test
    public void tesThirdPosition(){
        assertEquals("Roy",findMax("John","Harry","Roy"));
}
}