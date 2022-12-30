class Outter {   // 外部類別
  private int i = 1, j = 2; // 實體變數
  static int k = 3;         // 靜態變數

  class Inner {    // 內部類別
  	int j = 4, k = 5;  // 遮蓋了外部變數 j、k
  	void print() { 
  	  System.out.print(i);             //存取外部實體變數
  	  System.out.print(Outter.this.j); //存取被遮蓋的外部實體變數
  	  System.out.print(Outter.k);      //存取被遮蓋的外部靜態變數
  	  System.out.println(j);           //存取內部實體變數
    }
  }
  void callInner() {   // 外部類別的方法
    Inner in = new Inner();  // 在外部類別的方法中, 必須先建立內部物件
    in.print();              // 然後才能用它來呼叫內部類別的方法
  }
}

public class InnerClass {
  public static void main(String[] argv) {
  	Outter or = new Outter();         // 建立外部物件
  	or.callInner();                   // 呼叫外部物件的方法
  	Outter.Inner ir = or.new Inner(); // 用外部物件建立內部物件
  	ir.print();
  }
}
