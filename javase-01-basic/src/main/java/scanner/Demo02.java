package scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收: ");

        if(scanner.hasNextLine()){
            //使用next方式接收
            String str = scanner.nextLine();
            System.out.println("輸出的內容為 : "+str);
        }

        //凡是屬於IO流的類如果不關閉會一直占用資源，要養成好習慣用完就關掉
        scanner.close();
    }
}
