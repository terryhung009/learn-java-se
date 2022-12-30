import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {

        /*答案
        上午10點23分到下午15點20分
          共停了4小時 57分
          停車費為(4-4) * 2+ 1 * 60 + (4-2) * 40 * 2+ (2-0)*30*2=340

          假設停5個小時
          停車費為(5-4) * 2 * 60 + (4-2) * 2 * 40 + (2-0) * 2 * 30 = 400

        */



        //solution 2


        int hours = 0;
        int fee = 0;
        int startHour = 0;
        int endHour = 0;
        int startMinute = 0;
        int endMinute = 0;
        int halfHours = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入入場時間；幾時；(24小時制)");

        startHour = sc.nextInt();

        System.out.print("請輸入入場時間；幾分；");

        startMinute = sc.nextInt();

        System.out.print("請輸入離場時間：幾時；(24小時制)");

        endHour = sc.nextInt();

        System.out.print("請輸入離場時間：幾分；");

        endMinute = sc.nextInt();

        hours = endHour - startHour ;

        halfHours = 2 * hours;

        if(endMinute - startMinute < 0){
            halfHours--;
        }
        if(endMinute - startMinute >= 30){
            halfHours++;
        }

        if(halfHours>4*2){
            fee = (halfHours - 4 * 2)  * 60  + fee;
            halfHours = 8;

        }

        if(halfHours > 2 * 2){
            fee = (halfHours - 2 * 2 )  * 40  + fee;
            halfHours = 2 *2;
        }

        if(halfHours >0){
            fee = (halfHours - 0 * 2)  * 30 +fee;
            halfHours = 0;
        }
        System.out.println("停車時間從 " +startHour+" 時 "+startMinute+" 分到 "+endHour +" 時 "+endMinute +" 分");
        System.out.println("您的停車費總共是 " + fee + " 元");




    }
}
