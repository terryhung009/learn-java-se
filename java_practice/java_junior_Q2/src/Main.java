import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入年份；  ");
        int year = sc.nextInt();
        System.out.print("請輸入月份；  ");
        int month = sc.nextInt();
        System.out.print("請輸入日期；  ");
        int day = sc.nextInt();

//        boolean leapYear;
//        if(year % 4 ==0){
//            leapYear = true;
//        }else{
//            leapYear = false;
//        }
        boolean leapYear = (year % 4 == 0);
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(leapYear){
            days[1] = 29;
        }
        int result = 0;
        for(int i = 0; i < month-1 ; i++){
            result += days[i];
        }
        result += day;
        System.out.println(result);
    }
}