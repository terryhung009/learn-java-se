public class Main {
    /**思考方式：建立2維迴圈，外層控制第n個元素開始比對是否相等，內層控制從n+1個元素開始比對是否相等，
     * 一直比對到array最後一個元素array.length-1
     *
     *
     *
     * @param array
     * @return boolean
     */
    public static boolean findDuplicate(int[] array){
        for(int i = 0;i<array.length;i++){
            for(int j =i+1;j< array.length;j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }


    /**
     *
     * @param array
     * @return
     */

    public static boolean findDuplicate1(int[] array){
//        System.out.println(array.length);
        int[] new_array = new int[array.length];
        for(int i =0;i<array.length;i++){
            System.out.print(i+" ");
            new_array[i] = array[i];
        }
        System.out.println("");
        for(int j =0;j<array.length;j++){
            for (int k = 0; k<array.length;k++){
                if (array[j] == new_array[k]) {
                    continue;
                }else{

                }

            }
        }

        return false;

    }



    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1, 3, 5, 7, 9, 3}));;
        System.out.println(findDuplicate(new int[] {}));; // returns false
        System.out.println(findDuplicate(new int[] {3, 4, 5, 6, 7, 10000, 0}));;
    }
}
