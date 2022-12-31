import java.util.Scanner;

class Power{
    long power(int x,int y){
        if(y<=0){
            return 1;
        }
        return x * power(x,y-1);
    }
}

public class Main {


    public static void main(String[] args) {

        //solution 1
//        int number = 2;
//        long j = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("請輸入變數i： ");
//        int i = scanner.nextInt();
//        Power power = new Power();
//        if (i < 31){
//            j = power.power(number,i);
//        }
//        System.out.println("2的i乘方 ，值為  " + j);

        //solution 2

        long number = 2;
        long result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入變數i： ");
        int i = scanner.nextInt();

        if(i<31){

            for(int j =1; j<=i;j++){
//                System.out.println(j);
            result = number * result;
//                System.out.println(result);
            }
        }
        System.out.println("2的i乘方 ，值為 " + result);

    }


}
