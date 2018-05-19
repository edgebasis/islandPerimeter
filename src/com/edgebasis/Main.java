package com.edgebasis;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        int[][] grid = {    {0, 1, 0, 0},
                            {1, 1, 1, 0},
                            {0, 1, 0, 0},
                            {1, 1, 0, 0},
                            } ;
        int count=0;
        for(int i=0; i< grid.length; i++){
            for(int j=0 ;j< grid[0].length;j++){
                if(grid[i][j]==1){
                    count += countP(grid, i ,j);

                }
            }
        }

        System.out.println(count);

    }

    private static int countP(int[][] grid, int i, int j) {
        int counter=0;
        if(i-1 < 0|| grid[i-1][j]==0) counter++;
        if(i+1 >= grid.length || grid[i+1][j]==0) counter++;
        if(j-1 < 0 || grid[i][j-1]==0) counter++;
        if(j+1 > grid[0].length || grid[i][j+1]==0) counter++;


        return counter;
    }
}
