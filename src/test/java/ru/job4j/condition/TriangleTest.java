package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(5, 2, 2);
        assertThat(result).isFalse();
    }

}