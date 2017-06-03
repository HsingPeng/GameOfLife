package com.github.yongandpeng.gameoflife.test;

import com.github.yongandpeng.gameoflife.Cell;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bboxh on 2017/6/3.
 */
public class TestCell {

    @Test
    public void shouldReturnNextState() {
        int x, y, v, n;
        n = 3;
        int[][] matrix = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};

        x = 0;
        y = 0;
        v = 0;

        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 1;
        y = 0;
        v = 1;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 2;
        y = 0;
        v = 0;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 0;
        y = 1;
        v = 0;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 1;
        y = 1;
        v = 1;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 2;
        y = 1;
        v = 0;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 0;
        y = 2;
        v = 0;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 1;
        y = 2;
        v = 0;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);

        x = 2;
        y = 2;
        v = 0;
        Cell.nextState(matrix, x, y, n);
        assertEquals(v, matrix[x][y]);
    }
}
