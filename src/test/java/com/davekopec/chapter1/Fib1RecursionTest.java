package com.davekopec.chapter1;

import com.davekopec.ccspij.chapter1.Fib1Recursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Fib1RecursionTest {

    @Test
    void fib1RecursionSuccessTest() {
        Assertions.assertEquals(610, Fib1Recursion.fib1(15));
    }
}
