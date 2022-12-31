public class Main {
    public static int findMax2(int[] array){
        /**  思考方式：
         * 宣告變數max並與array每一元素比較，若元素比較大，則將元素值存入max
         *
         *
         *
         */
        int max =0;
        for(int i = 0;i < array.length;i++){
            if(max < array[i]){
                max = array[i] ;
            }
        }
        return max;


    }
    public static int findMax(int[] array){

        /**  思考方式：用氣泡排序法重新排序整個array
         *   再輸出最後一位元素(最大值)
         *
         *
         */
        for(int i = 0;i < array.length;i++){
            for (int j = 0; j < array.length - 1 - i;j++){
                if( array[j] > array[j+1] ){
                    int temp=0;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }

            }
            /**
             * 輸出每一輪排序的array情形
             */
//            for(int k = 0; k<array.length;k++){
//                System.out.print(" " + array[k]);
//
//            }
//            System.out.println("");
        }







        return array[array.length-1];
    }


    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        System.out.println(findMax2(array));
    }
}
