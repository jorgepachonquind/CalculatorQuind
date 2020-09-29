package io.quind.demo.Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sub() {
        Sub sub = new Sub();
        int result = 10;
        Assertions.assertEquals(10, sub.sub(20,10));
    }
}