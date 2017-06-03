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
        int[][] matrix = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};

        x = 0;
        y = 0;
        v = 0;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 1;
        y = 0;
        v = 1;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 2;
        y = 0;
        v = 0;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 0;
        y = 1;
        v = 0;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 1;
        y = 1;
        v = 1;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 2;
        y = 1;
        v = 0;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 0;
        y = 2;
        v = 0;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 1;
        y = 2;
        v = 1;
        assertEquals(v, Cell.nextState(matrix, x, y, n));

        x = 2;
        y = 2;
        v = 0;
        assertEquals(v, Cell.nextState(matrix, x, y, n));
    }

    @Test
    public void shouldReturnChangeTargetMarticx(){
        int[][] matrix = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] valueMatrix = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int [][] getNextMartix = Cell.nextMartix(matrix,3);
        for (int i = 0;i < 3 ;i++){
            for (int j = 0;j < 3;j++){
                assertEquals(valueMatrix[i][j], getNextMartix[i][j]);
            }
        }
    }

}
