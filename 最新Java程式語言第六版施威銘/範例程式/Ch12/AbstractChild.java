abstract class Parent { // 抽像類別
  abstract void show(); // 抽像方法
}

abstract class Child extends Parent { // Parent 的子類別
  // 沒有實作show，自動成為抽像類別
}

class Grandson extends Child { // Child 的子類別
  void show() {                // 實作了抽像方法
    System.out.println("我有實作抽像方法");
  }
}

public class AbstractChild {
  static public void main(String argv[]) {
    Parent p = new Grandson(); // 建立子類別的物件
    p.show();
  }
}
