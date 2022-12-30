class Parent { // 父類別
  void Show() {
    System.out.println("我是父類別");
  }
}

class Child extends Parent { // 子類別
}

public class Method {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生子類別的物件
    c.Show(); // 叫用父類別中定義的方法
  }
}
