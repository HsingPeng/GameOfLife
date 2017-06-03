package com.github.yongandpeng.gameoflife.test;

import com.github.yongandpeng.gameoflife.Config;
import com.github.yongandpeng.gameoflife.Init;
import org.junit.Test;

/**
 * Created by bboxh on 2017/6/3.
 */
public class TestInit {
    @Test
    public void testInitFromFile() {
        int[][] matrix = Init.initFromFile(Config.INPUT_FILE_NAME);
        for(int[] i: matrix) {
            for(int j: i) {
                System.out.print(String.valueOf(j));
            }
            System.out.println();
        }
    }
}