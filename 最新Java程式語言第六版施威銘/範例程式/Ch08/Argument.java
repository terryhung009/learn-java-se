public class Argument {
  public static void main(String[] argv){
    Argument a = new Argument(); // 建立測試物件
    int i = 20;

    System.out.println("呼叫方法前  i = " + i);
    a.changePara(i);   // 傳入 i
    System.out.println("呼叫方法後  i = " + i);
  }

  void changePara(int x) {       // 會修改參數值的方法
    System.out.println("...方法參數 x = "+ x);
    System.out.println("...修改中");
    x ++;   // 更改接收到的參數值
    System.out.println("...現在參數 x = "+ x);
  }
}