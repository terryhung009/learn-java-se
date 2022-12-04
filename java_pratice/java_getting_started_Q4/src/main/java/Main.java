import java.util.ArrayList;

public class Main {
    /** 思考方式：
     * 我會宣告一個空的陣列
     * 然後foreach要反轉的陣列(從最後面開始往前跑)
     *
     * 然後把跑道的元素加到新的陣列
     *
     */
    public static int[] reverseArray3(int[] array){
        int[] new_array = new int[array.length];
//        new_array[0] = array[15];
//        new_array[1] = array[14];
//        new_array[2] = array[13];
//        new_array[3] = array[12];
//        new_array[4] = array[11];
//        new_array[5] = array[10];

       int i = 0;
        for(int j = array.length-1;j>=0;j--){

            new_array[i] = array[j];
            i++;

        }

        /**
         * 印出new_array
         */
//        for(int k : new_array){
//            System.out.print(" "+k);
//        }


        return new_array;
    }

    public static ArrayList<Integer> reverseArray2(int[] array){
        /** 思考方式：
         * 宣告arrayList new_array 迴圈將array元素從最後開始加入new_array
         *
         *
         *
         *
         */

        ArrayList<Integer> new_array = new ArrayList<>();


        for(int j = array.length-1;j>=0;j--){
            new_array.add(array[j]);
        }
        /**
         * 印出new_array
         */
//        for(int k : new_array){
//            System.out.print(" "+k);
//        }



        return new_array;
    }
    public static int[] reverseArray(int[] array){
        /**思考方式：
         * 第1輪不斷對換把第一個元素移到最後，然後不要再對換最後一個元素
         *
         *
         * 第一輪從第1個元素跟第2個元素對換直到最後第15個元素
         * 第2輪一樣從第1個元素跟第2個元素對換直到最後第14個元素
         * 第i輪比較第1個元素到第15-i元素
         * 第i輪比較第1個元素到第n-i元素
         *
         *
         *
         */
        for (int i = 0;i<array.length;i++){
            for (int j = 0; j < array.length-1-i; j++){
                int temp = 0;
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }

            /**
             * 印出每一輪 array的情形
             */
//            for( int k = 0; k< array.length;k++){
//                System.out.print(" " + array[k]);
//            }
//            System.out.println("");
        }
        return array;
    }




    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        int[] reversedArray = reverseArray3(array);
        for (int i : reversedArray) {
            System.out.print("  " + i);
        }

    }
}
