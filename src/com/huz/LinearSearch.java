package com.huz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter marks of SDA of BSSE 4B");

        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered : " + Arrays.toString(arr));

        int target = -1;
        System.out.print("Enter the number to find in the list : ");
        target = sc.nextInt();

        int idx = linearSearch(arr,target);
        if(idx == -1){
            System.out.println(target + " is not present in the list.");
        }
        else {
            System.out.println(target + " is at index : " + idx);
        }

    }

    static int linearSearch(int[] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
