import java.util.Scanner;


public class Main {

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int gcd(int x, int y){
        while( y != 0 ){
            int remainder = x % y;
            x = y;
            y = remainder;
        }

        return x;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int lcm(int x, int y){
         return (x * y) / gcd(x,y);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字a:  ");
        int a = scanner.nextInt();
        System.out.println("請輸入數字b:  ");
        int b = scanner.nextInt();
        System.out.println( a + " , " + b +" 的最大公因數是 " + gcd(a, b)  );
        System.out.println( a + " , " + b + " 的最小公倍數是 " + lcm(a, b) );







    }
}