package com.huz;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] array = {
                {102,20,32,69},
                {4,5,6,67},
                {7,8,9}
        };

        int target = 67;
        int[] ans = search(array,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] array,int target){
        int[] idxs = new int[2];
        idxs[0] = -1;
        idxs[1] = -1;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(target == array[row][col]){
                    idxs[0] = row;
                    idxs[1] = col;
                    return idxs;
                }
            }
        }
        return idxs;

    }}
