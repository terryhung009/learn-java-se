class Test {
  int x = 10,y = 20;

  // 建構方法參數與成員變數同名
  Test(int x,int y) {
    this.x = x;
    this.y = y;
  }
}

public class Shadowing {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    System.out.println("成員變數x：" + a.x);
    System.out.println("成員變數y：" + a.y);
  }
}