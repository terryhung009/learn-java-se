import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalMoney = 137;
        int numberTenDollar;
        int numberFiveDollar;
        int numberOneDollar;
        int i;

        System.out.print("請輸入總金額； ");
        Scanner sc = new Scanner(System.in);
        totalMoney = sc.nextInt();



        numberTenDollar = totalMoney / 10;
        i = totalMoney % 10;
        numberFiveDollar = i / 5;
        numberOneDollar = i % 5;


        System.out.println("最少的硬幣數量為； ");
        System.out.println("10元硬幣" + numberTenDollar + "個");
        System.out.println("5元硬幣" + numberFiveDollar + "個");
        System.out.println("1元硬幣" + numberOneDollar + "個");

    }
}
