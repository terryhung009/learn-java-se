public class PlayDice {
  public static void main(String[] argv) {
    int[] data = new int[19]; // 儲存擲骰點數出現次數
    int base=0;
    for(int i=1;i<=6;i++)     // 2 個迴圈分別代表 2 個骰子
      for(int j=1;j<=6;j++) { // i+j 就是擲出的點數
        data[i+j]++;          // 將代表次數的元素加 1
        base++;               //
      }

    for(int point=0;point<data.length;point++)
      if(data[point]>0)
        System.out.println("擲出"+ point + "點的機率為" +
                           base+ "分之" + data[point]);
  }
}

