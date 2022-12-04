import java.util.Scanner;

public class Main {

    public static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }





    public static void main(String[] args) {
//        System.out.println(fibonacci(5));
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入費波那契 數字n:  ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));




    }
}