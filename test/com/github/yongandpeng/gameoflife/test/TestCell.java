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
        int[][] matrix= {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        Cell.nextState(matrix, 0, 0, 3);
        assertEquals(matrix[0][0], 0);
    }
}
