import java.util.ArrayList;

public class Main {

    public static void position(String word){
        /**思考方式：建立A-Z大寫字母alphabet array，使用2維陣列，外層迴圈String word依每個字元
         * 迴圈比對內層alphabet每個字元，有相同字元return true;
         *
         */
        char[] alphabet = {'A','B','C','D','E','F','G','I','J','K','L','M','N'
        ,'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < word.length();i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (word.charAt(i) == alphabet[j]) {
                    System.out.println(word.charAt(i) + " " + word.indexOf(word.charAt(i)));
                    return;
                }

            }
            if (i == word.length() - 1) {
                if (word.charAt(word.length() - 1) != alphabet[alphabet.length - 1]) {
                    System.out.println("-1");
                    break;
                }

            }
        }


    }

    /**思考方式：建立迴圈將Sting s ，依字元取出存入變數 c，如果 c.使用轉換大寫方法 == 原本的c
     * ，印出變數 c 及 index i，最後終止迴圈
     * 建立 boolean變數 found = false，如果迴圈中都沒有比對到，就印出 -1
     * 如果比對到，found = true，不要印出
     *
     */
    public static void position1(String s){
        boolean found = false;

        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.toUpperCase(c)== c){
                System.out.println(c + " " + i);
                found = true;
                return;
            }
        }

        if(!found){
            System.out.println(-1);
        }


    }










    public static void main(String[] args) {
        position1("abcd"); // prints -1
        position1("AbcD"); // prints A 0
        position1("abCD"); // prints C 2
    }
}
