package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ChessBoardTest {

    @Test
    public void wayIs5() {
        int result = ChessBoard.way(6, 7, 1, 2);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void wayIs7() {
        int result = ChessBoard.way(7, 0, 0, 7);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void wayIs0() {
        int result = ChessBoard.way(2, 6, 4, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX1isMinus1ThenWayIs0() {
        int result = ChessBoard.way(-1, 6, 4, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0() {
        int result = ChessBoard.way(2, -1, 4, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0() {
        int result = ChessBoard.way(2, 6, -1, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY2isMinus1ThenWayIs0() {
        int result = ChessBoard.way(2, 6, 4, -1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX1isGrater7ThenWayIs0() {
        int result = ChessBoard.way(10, 6, 4, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY1isGrater7ThenWayIs0() {
        int result = ChessBoard.way(2, 10, 4, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX2isGrater7ThenWayIs0() {
        int result = ChessBoard.way(2, 6, 10, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenY2isGrater7ThenWayIs0() {
        int result = ChessBoard.way(2, 6, 4, 10);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}