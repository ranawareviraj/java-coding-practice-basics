package org.example.loop;

import org.example.loops.Loops_11_Prime;
import org.junit.Assert;
import org.junit.Test;

public class Loops_11_Prime_Test {

    @Test

   public void checkIsPrime(){
       int n = 3;
        Assert.assertTrue(Loops_11_Prime.isPrime(n));
    }

    @Test
    public void checkNotIsPrime(){
        int n = 4;
        Assert.assertFalse(Loops_11_Prime.isPrime(n));
    }
}