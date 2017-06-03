package com.github.yongandpeng.gameoflife.test;

import com.github.yongandpeng.gameoflife.Config;
import com.github.yongandpeng.gameoflife.Init;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by bboxh on 2017/6/3.
 */
public class TestInit {
    @Test
    public void testInitFromFile() {
        int[][] matrix = Init.initFromFile(Config.TESTINPUT_FILE_NAME);
        int[][] matrixExpect = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        assertArrayEquals(matrixExpect, matrix);
        /*for(int[] i: matrix) {
            for(int j: i) {
                System.out.print(String.valueOf(j));
            }
            System.out.println();
        }*/
    }
}