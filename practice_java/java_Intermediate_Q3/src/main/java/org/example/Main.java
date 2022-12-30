package org.example;

import java.util.ArrayList;

public class Main {
    /**
     *
     *
     * @param arr
     * @return
     */
    public static int[]  flatten(int[][][] arr){
        //parameter arr is array of array of array of Integers
        ArrayList<Integer> r = new ArrayList<>();
        //a is an array of array of Integers
        for(int[][] a : arr){
            //b is an  array of Integers
            for(int[] b : a){
                //c is an integer
                for(int c : b){
                    r.add(c);
                }
            }
        }

        int[] result = new int[r.size()];
        for(int i =0 ; i < result.length;i++){
            result[i] = r.get(i);
        }

        return result;


    }



    public static void main(String[] args) {
        int[][][] arr = {{ {1, 2} }, { {3, 4}, {5}, {6} }, { {7, 8}, {9, 10}}, {{3, 4}, {4, 1}}, {{}, {43, 13}}};
        int[] array = flatten(arr);
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}