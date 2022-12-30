class Test {
  int x = 10,y = 20;

  // 兩個參數的建構方法
  Test(int initX,int initY) {
    x = initX;
    y = initY;
  }

  // 一個參數的建構方法
  Test(int initX) {
    x = initX;
  }

  // 不具參數的建構方法
  Test() {
  }

  void show() { // 顯示成員變數的方法
    System.out.println("成員變數x：" + x);
    System.out.println("成員變數y：" + y);
  }
}

public class Overloading {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    Test b = new Test(60);
    Test c = new Test();

    a.show();
    b.show();
    c.show();
  }
}