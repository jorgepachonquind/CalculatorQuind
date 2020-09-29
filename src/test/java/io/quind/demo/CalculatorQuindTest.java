package io.quind.demo;

import io.quind.demo.Models.Div;
import io.quind.demo.Models.Multi;
import io.quind.demo.Models.Sub;
import io.quind.demo.Models.Sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorQuindTest {

    @Test
    void sum() {
        Sum sum = new Sum();
        Assertions.assertEquals(10, sum.sum(5,5));
    }

    @Test
    void sub() {
        Sub sub = new Sub();
        Assertions.assertEquals(10, sub.sub(15,5));
    }

    @Test
    void div() {
        Div div = new Div();
        Assertions.assertEquals(10, div.div(100,10));
    }

    @Test
    void multi() {
        Multi multi = new Multi();
        Assertions.assertEquals(10, multi.multi(5,2));
    }
}