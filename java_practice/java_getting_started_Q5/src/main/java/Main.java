public class Main {
    /**思考方式；使用遞迴方法，
     * 定義n為1，(1+...+n)為1，
     * (1+...+n)為 n + (1+...+n-1)
     *
     * @param n
     * @return
     */
    public static int addUpTo3(int n){
        if(n == 1){
            return 1;
        }else{
            return n + addUpTo3(n-1);
        }

    }
    /**思考方式；依據數學公式  等差級數總和等於 首項 加 末項 乘以 項數 再 除以 2
     *
     * @param n
     * @return int
     */

    public static int addUpTo2(int n){
        return ((1+n) * n) / 2;
    }

    /**思考方式；
     * 宣告變數total=0，迴圈將1+2+3+...+n的結果總和，存入total
     *
     * @param n
     * @return int total
     */
    public static int addUpTo(int n){
        int total = 0;
        for(int i = 0; i <= n;i++){
            total += i;
        }
        return total;
    }






    public static void main(String[] args) {
        System.out.println(addUpTo3(10));
        System.out.println(addUpTo3(100));
        System.out.println(addUpTo3(1000));
        System.out.println(addUpTo3(10000));
    }
}
