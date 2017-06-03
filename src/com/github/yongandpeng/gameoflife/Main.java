package com.github.yongandpeng.gameoflife;

import java.util.Scanner;

/**
 * Created by bboxh on 2017/6/3.
 */
public class Main {

    public static void getTargetTimesMartix() {
        Scanner inNeme = new Scanner(System.in);
        System.out.println("请输入变换次数:");
        int times = inNeme.nextInt();
        int[][] matrix = Init.initFromFile(Config.INPUT_FILE_NAME);
        for (int i = 0; i < times; i++) {
            int[][] getNextMartix = TransStatus.nextMartix(matrix, matrix.length);
            for (int j = 0; j < getNextMartix.length; j++) {
                for (int k = 0; k < getNextMartix.length; k++) {
                    System.out.print(getNextMartix[k][j]);
                }
                System.out.println();
            }
            System.out.println("变换：第" + (i + 1) + "次！");
            System.out.println();
            matrix = getNextMartix;
        }
    }

    public static void main(String[] args) {
        //getTargetTimesMartix();

        startGUI();
    }

    private static void startGUI() {
        int[][] matrix = Init.initFromFile(Config.INPUT_FILE_NAME);

        GUI gui = new GUI();
        gui.setmMatrix(matrix);
    }
}
