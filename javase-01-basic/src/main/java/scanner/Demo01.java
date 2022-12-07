package scanner;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        //創建一個掃描器對象，用於接收鍵盤數據
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收: ");

        //判斷用戶有沒有輸入字符串
        if(scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next();
            System.out.println("輸出的內容為 : "+str);
        }

        //凡是屬於IO流的類如果不關閉會一直占用資源，要養成好習慣用完就關掉
        scanner.close();

    }
}
