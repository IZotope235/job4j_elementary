package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax20to10Then20() {
        int result = Max.max(20, 10);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to10Then10() {
        int result = Max.max(10, 10);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to30Then10() {
        int result = Max.max(10, 30);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to30to40Then40() {
        int result = Max.max(10, 30, 40);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to30to30Then30() {
        int result = Max.max(10, 30, 30);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to10to10Then10() {
        int result = Max.max(10, 10, 10);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to20to30to40Then40() {
        int result = Max.max(10, 20, 30, 40);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10to20to30to10Then30() {
        int result = Max.max(10, 20, 30, 10);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }
}