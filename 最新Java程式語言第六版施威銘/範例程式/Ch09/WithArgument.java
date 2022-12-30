class Test {
  int x,y;

  // 具有參數的建構方法
  Test(int initX,int initY) {
    x = initX;
    y = initY;
  }
}

public class WithArgument {

  public static void main(String[] argv){
    Test a = new Test(30,40);
    System.out.println("成員變數x：" + a.x);
    System.out.println("成員變數y：" + a.y);
  }
}