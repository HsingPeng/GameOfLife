package com.github.yongandpeng.gameoflife;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bboxh on 2017/6/3.
 */
public class Init {
    public static int[][] initFromFile(String fileName) {
        BufferedReader reader;
        List<String> list = new ArrayList();
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
            String line;
            while((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int n = list.size();
        int matrix[][] = new int[n][n];

        for(int i=0; i < n; i++) {
            String[] lineSplitStr = list.get(i).split("\\s+");
            for(int j=0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(lineSplitStr[j]);
            }
        }
        return matrix;
    }
}
