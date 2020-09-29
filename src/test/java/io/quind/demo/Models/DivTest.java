package io.quind.demo.Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void div() {
        Div div = new Div();
        Assertions.assertEquals(10, div.div(20,2));
    }
}