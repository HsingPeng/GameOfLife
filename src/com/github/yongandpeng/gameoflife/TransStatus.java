package com.github.yongandpeng.gameoflife;

/**
 * Created by bboxh on 2017/6/3.
 */
public class TransStatus {
    public static int nextStatus(int[][] matrix, int x, int y, int n) {
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
        if(liveCell == 3){
            value = 1;
        }else if(liveCell < 2 || liveCell > 3){
            value = 0;
        }
        return value;
    }

    public static void main(String[] args) {

    }

    public static int[][] nextMartix(int[][] martix,int n){
        int [][] targetMartix = new int[n][n];
        for (int i = 0;i < n ;i++){
            for (int j = 0;j < n;j++){
                targetMartix[i][j] = nextStatus(martix,i,j,n);
            }
        }
        return targetMartix;
    }

    private static boolean validateArrayOutofBounds(int x,int y,int n){
        boolean flag = false;
        if(x >= 0 && y >= 0 && x < n && y < n){
            flag = true;
        }
        return  flag;
    }

}
