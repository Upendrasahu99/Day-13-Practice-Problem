package com.bridgelabz;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaximumIntTest {
@Test
    public  void testFirstPosition(){
    Integer max = MaximumIntegers.findMax(10,5,2);
    assertEquals(10, 10 );
}
@Test
    public void secondPosition(){
    Integer max = MaximumIntegers.findMax(5,10,2);
    assertEquals(10,10);
}
@Test
    public void thirdPosition(){
    Integer max = MaximumIntegers.findMax(5,2,10);
    assertEquals(10,10);
}
}