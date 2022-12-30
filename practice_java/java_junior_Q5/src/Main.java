import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入a值；  ");
        int a =  scanner.nextInt();
        System.out.print("請輸入n值；  ");
        int n =  scanner.nextInt();

        int result = 0;
        for(int i =0 ; i < n;i++){
            for(int j =0; j<=i; j++){
                result +=  (a * Math.pow(10,j));
            }
        }

        System.out.println("計算結果為； " + result );


    }
}