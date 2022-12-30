import java.io.*;

public class CatchAndShowInfo {

  public static void main(String[] argv) throws IOException{

    int[] secret = {65535,3001,1999,1496,119};
    System.out.print("本程式有 5 個神秘數字, 您要看第幾個？");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int target = Integer.parseInt(str); // 轉換為 int

    try {

      System.out.println("第 " + target + " 個神秘數字是 "
                          + secret[target-1]);
    } catch (ArrayIndexOutOfBoundsException e) {

      System.out.println("您指定的筆數超出範圍。");
      System.out.println("您要看的是第 " + target + " 個神秘數字,");
      System.out.println("  但我們只有 5 個神秘數字。");
    }

    System.out.println("歡迎再次使用！");
  }
}
