package com.github.yongandpeng.gameoflife.test;

import com.github.yongandpeng.gameoflife.TransStatus;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

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
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 1;
        y = 0;
        v = 1;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 2;
        y = 0;
        v = 0;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 0;
        y = 1;
        v = 0;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 1;
        y = 1;
        v = 1;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 2;
        y = 1;
        v = 0;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 0;
        y = 2;
        v = 0;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 1;
        y = 2;
        v = 1;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));

        x = 2;
        y = 2;
        v = 0;
        assertEquals(v, TransStatus.nextStatus(matrix, x, y, n));
    }

    @Test
    public void shouldReturnChangeTargetMarticx(){
        int[][] matrix = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] valueMatrix = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int [][] getNextMartix = TransStatus.nextMartix(matrix,3);
        assertArrayEquals(valueMatrix, getNextMartix);
    }

    @Test
    public void shouldReturnChangeTargetMarticxWith4x4(){
        int[][] matrix = {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0} , {0, 1, 1, 0}};
        int[][] valueMatrix = {{0, 1, 1, 0}, {1, 0 , 0, 1}, {1, 0, 0, 1}, {0, 1, 1, 0}};
        int [][] getNextMartix = TransStatus.nextMartix(matrix,4);
        assertArrayEquals(valueMatrix, getNextMartix);
    }

    @Test
    public void shouldReturnChangeTargetMarticxWith5x5(){
        int[][] matrix = {{1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0} , {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}};
        int[][] valueMatrix = {{0, 0, 0, 0, 0}, {1, 0 , 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 0 , 1, 0, 1}, {0, 0, 0, 0, 0}};
        int [][] getNextMartix = TransStatus.nextMartix(matrix,5);
        assertArrayEquals(valueMatrix, getNextMartix);
    }

}
