package com.github.yongandpeng.gameoflife;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bboxh on 2017/6/3.
 */
public class GUIMainPanel extends JPanel {
    private int[][] mMatrix;
    private int n = 0;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLUE);
        g.drawRect(0, 0, n * Config.SCALE, n * Config.SCALE);

        if (mMatrix == null) {
            return;
        }

        paintMatrix(g);
    }

    private void paintMatrix(Graphics g) {
        int[][] matrix = mMatrix;

        g.setColor(Color.BLUE);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    g.fillRect(i * Config.SCALE, j * Config.SCALE, Config.SCALE, Config.SCALE);
                }
            }
        }
    }

    public void setMatrix(int[][] matrix) {
        this.mMatrix = matrix;
        n = matrix.length;
        //this.repaint();
    }

    public int[][] getMatrix() {
        return mMatrix;
    }
}
