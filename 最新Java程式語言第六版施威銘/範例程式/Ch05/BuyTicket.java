import java.util.*;

public class BuyTicket {

  public static void main(String[] argv) {

    System.out.print("要買什麼票 (1.全票 2.優待票 3.星光票)？");

    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    switch(choice) {
      case 1:  // 全票
        System.out.println("全票 399 元");
        break;
      case 2:  // 優待票
        System.out.println("優待票 199 元");
        break;
      case 3:  // 星光票
        System.out.println("星光票 249 元");
        break;
      default: // 其它狀況
        System.out.println("輸入錯誤");
    }
  }
}