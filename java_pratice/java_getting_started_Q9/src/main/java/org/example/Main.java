package org.example;

public class Main {
    /**思考方式：
     * 使用2維迴圈，內層負責印出星號，外層控制行數
     * ，內層要印出的星號數量為i(第一層列印1，第二層列印2)
     *
     * @param n
     */
    public static void pyramid(int n){

        for(int i =1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
//            for(int k=1; k<=n-i;k++){
//                System.out.print(" ");
//            }
            System.out.println("");

        }
    }

    /**思考方式：
     * 將金字塔分解為一行來看，第1行印出1個星號，第2行印出2個星號，第n行印出n個星號
     * 
     *
     * @param n
     */
    public static void pyramid2(int n){
        String s = "";
        for(int i=1;i<=n;i++){
            s +="*";
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        pyramid2(1);
        System.out.println("====================");
        pyramid2(3);
        System.out.println("====================");
        pyramid2(5);
    }
}