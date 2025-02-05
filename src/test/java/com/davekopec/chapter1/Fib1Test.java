package com.davekopec.chapter1;

import com.davekopec.ccspij.chapter1.Fib1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Fib1Test {

    @Test
    void fib1SuccessTest() {
        Assertions.assertThrows(StackOverflowError.class, ()->Fib1.fib1(2) );
    }
}
