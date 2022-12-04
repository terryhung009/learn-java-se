public class Main {
    /**宣告counter變數，用迴圈判斷array內是否有值小於 n 的數字，
     * 若 n 小於 array[i] 把counter加1
     * 最後返回counter的值
     *
     * @param array
     * @param n
     * @return
     */

    public static int findSmallCount(int[] array, int n){
        int counter =0;
        for(int i=0;i< array.length;i++){
            if(array[i] < n){
                counter++;
            }
        }



        return counter;
    }








    public static void main(String[] args) {
        System.out.println(findSmallCount(new int[] {1, 2, 3}, 2));
        System.out.println(findSmallCount(new int[] {1, 2, 3, 4, 5}, 0));
    }
}