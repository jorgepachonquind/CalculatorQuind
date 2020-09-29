package io.quind.demo.Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sum() {
        Sum sum = new Sum();
        Assertions.assertEquals(10, sum.sum(5,5));
    }
}