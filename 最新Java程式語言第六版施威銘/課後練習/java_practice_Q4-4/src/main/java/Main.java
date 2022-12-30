import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        int j;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入變數i的數值；");
        i = scanner.nextInt();
        System.out.println("請輸入變數j的數值；");
        j = scanner.nextInt();

        result = (i + j) * ( i + j );

        System.out.println("變數i與變數j的和的平方為 " + result);
    }
}
