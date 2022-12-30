class Test {
  int x,y;

  // 不具參數的建構方法
  Test() {
    x = 10;
    y = 20;
  }
}

public class NoArgument {

  public static void main(String[] argv){
    Test a = new Test();
    System.out.println("成員變數x：" + a.x);
    System.out.println("成員變數y：" + a.y);
  }
}