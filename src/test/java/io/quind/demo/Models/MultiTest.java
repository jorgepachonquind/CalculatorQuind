package io.quind.demo.Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void multi() {
        Multi multi = new Multi();
        int result = 200;
        Assertions.assertEquals(200, multi.multi(20,10));
    }
}