import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入任意整數： ");
        number = sc.nextInt();

        if(number % 2 ==0){
            System.out.println("您輸入的數字 "+ number + " 是偶數。");
        }
        else if(number % 2 !=0){
            System.out.println("您輸入的數字 "+ number + " 是奇數。");
        }
    }
}
