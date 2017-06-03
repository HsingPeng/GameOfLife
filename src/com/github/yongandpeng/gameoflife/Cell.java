package com.github.yongandpeng.gameoflife;

/**
 * Created by bboxh on 2017/6/3.
 */
public class Cell {
    public static int nextState(int[][] matrix, int x, int y, int n) {
        int liveCell = 0;
        int value = matrix[x][y];
        if (validateArrayOutofBounds(x-1, y-1, n) && matrix[x-1][y-1] == 1 ) {
            liveCell++;
        }
        if (validateArrayOutofBounds(x, y-1, n) && matrix[x][y-1] == 1 ){
            liveCell++;
        }
        if (validateArrayOutofBounds(x+1, y-1, n)  && matrix[x+1][y-1] == 1 ){
            liveCell++;
        }
        if (validateArrayOutofBounds(x-1, y, n)  && matrix[x-1][y] == 1 ){
            liveCell++;
        }
        if (validateArrayOutofBounds(x+1, y, n)  && matrix[x+1][y] == 1 ){
            liveCell++;
        }
        if (validateArrayOutofBounds(x-1, y+1, n)  && matrix[x-1][y+1] == 1 ){
            liveCell++;
        }
        if (validateArrayOutofBounds(x, y+1, n)  && matrix[x][y+1] == 1 ){
            liveCell++;
        }
        if (validateArrayOutofBounds(x+1, y+1, n)  && matrix[x+1][y+1] == 1 ){
            liveCell++;
        }
        if(liveCell >= 3){
            value = 1;
        }else if(liveCell < 2){
            value = 0;
        }
        return value;
    }

    public static void main(String[] args) {

    }

    private static boolean validateArrayOutofBounds(int x,int y,int n){
        boolean flag = false;
        if(x >= 0 && y >= 0 && x < n && y < n){
            flag = true;
        }
        return  flag;
    }

}
