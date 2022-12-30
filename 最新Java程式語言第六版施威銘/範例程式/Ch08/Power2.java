import java.util.*;

class Recursive {
   long power(int x, int y) {
    if(y <= 0)   return 1;
    //if(y == 1)   return x;
    if(y%2==0)  // 次方是偶數
      return power(x, y/2)*power(x, y/2);     // 呼叫自己
    // 次方是奇數
    return x * power(x, y/2) * power(x, y/2); // 呼叫自己
  }
}

public class Power2 {
  public static void main(String[] argv) {
    Recursive r = new Recursive();

    Scanner sc = new Scanner(System.in);
    System.out.print("請輸入整數 x y (用空白分隔)：");
    int x = sc.nextInt(); // 可連續讀入用空白分隔的數字
    int y = sc.nextInt();

    System.out.println(r.power(x,y));
  }
}