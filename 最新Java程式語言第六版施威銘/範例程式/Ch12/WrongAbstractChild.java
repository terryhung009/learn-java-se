abstract class Parent { // 抽像類別
  abstract void show(); // 抽像方法
}

class Child extends Parent { // Parent 的子類別
  // 沒有實作show，自動成為抽像類別
}

class Grandson extends Child { // Child 的子類別
  void show() { // 實作了抽像方法
    System.out.println("我有實作抽像方法");
  }
}

public class WrongAbstractChild {
  static public void main(String argv[]) {
    Parent p = new Child(); // 企圖建立抽像類別的物件
  }
}
