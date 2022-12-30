class IcCard {  // 代表 IC 卡的類別
  long id;      // 卡號
  int money;    // 卡片餘額

  void showInfo() {  // 顯示卡片資訊的方法
    System.out.print("卡片卡號 "+ id);
    System.out.println(", 餘額 " + money + " 元 ");
  }
}

public class Card3 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // 建立物件

    myCard.id = 0x336789AB;  // 設定成員變數值
    myCard.money = 300;

    myCard.showInfo();       // 呼叫方法
  }
}