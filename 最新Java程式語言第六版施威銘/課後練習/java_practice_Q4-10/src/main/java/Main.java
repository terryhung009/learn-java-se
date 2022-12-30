import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        (提示： 攝氏溫度等於華氏溫度減32度再乘上5/9)

        攝氏 = 華氏 -32 * 5 / 9
        華氏 = 攝氏 * 9 / 5 + 32
         */
        int Celsius = 0;
        int Fahrenheit = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入想轉換為華氏溫度的攝氏溫度； ");
        Celsius = sc.nextInt();

        Fahrenheit = Celsius * 9 / 5 + 32;

        System.out.println("您輸入的攝氏溫度 " + Celsius + " 度，轉換為華氏溫度為 " +Fahrenheit+" 度");


    }
}
