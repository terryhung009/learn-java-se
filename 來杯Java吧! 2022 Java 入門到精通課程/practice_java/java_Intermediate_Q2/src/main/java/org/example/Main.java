package org.example;

import java.util.Random;

public class Main {
    /**先設定變數 currentIndex 為array最後元素的值
     * 想像有個指標指著array最後一位，我想把最後一位元素跟隨機元素交換
     * 接下來最後一位就固定下來，指標往前一位，
     * 繼續做到array第一位元素
     *
     * @param array
     * @return
     */
    public static int[] shuffle(int[] array){
        int currentIndex = array.length -1;
        while(currentIndex > 0){
            Random random = new Random();
            int i = random.nextInt(currentIndex - 0 + 1) + 0;
            //swap currentIndex and i
            int temp = array[currentIndex];
            array[currentIndex] = array[i];
            array[i] = temp;

            currentIndex--;
        }

        return array;
    }

    /** 使用二維迴圈
     *
     * @param array
     * @return
     */
//    public static int[] shuffle2(int[] array){
//
//
//    }




    public static void main(String[] args) {
        int[] array = {5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677};
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("========================");
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("========================");
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}