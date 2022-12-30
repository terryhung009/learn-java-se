class PollingStation extends Thread { // 開票所
  static int reportTimes = 5; // 回報次數
  int total = 0; // 此開票所總票數
  Vote2 v; // Vote2物件
  String name; // 開票所名稱

  public PollingStation(Vote2 v,String name) { // 建構方法
    this.v = v; // 記錄Vote2物件
    this.name = name; // 記錄開票所名稱
  }

  public void run() { // 執行緒要進行工作
    for(int i = 0;i < reportTimes;i++) {
      //以亂數產生新增得票數
      int count = (int)(Math.random() * 500);
      v.reportCount(name,count); // 回報新增得票數並加總
      total += count; // 此開票所加總
    }
  }
}

public class Vote2 {
  private int total = 0; // 總開票數
  private int numOfStations = 2; // 開票所數
  private PollingStation[] stations;

  public void reportCount(String name, int count) {

    synchronized(this) {
      int temp = total;

      System.out.println(name + "開票所得" + count + "票");
      temp = temp + count;
      System.out.println("目前總票數：" + temp);
      total = temp;
    }
  }

  public void startReport() {
    // 建立陣列
    stations = new PollingStation[numOfStations];

    // 一一建立投票所物件，並且執行
    for(int i = 1;i <= numOfStations;i++) {
       stations[i - 1] = new PollingStation(this,i + "號");
    }

    // 一一啟動執行緒
    for(int i = 0;i < numOfStations;i++) {
       stations[i].start();
    }

    // 一一等待投票所開票結束
    for(int i = 0;i < numOfStations;i++) {
      try {
         stations[i].join();
      } catch(InterruptedException e) {}
    }

    System.out.println("最後投票結果：");

    // 一一顯示各投票所票數
    for(int i = 0;i < numOfStations;i++) {
      System.out.println(stations[i].name + ":" +
              stations[i].total);
    }

    // 顯示最後總票數
    System.out.println("總票數：" + total);
  }

  public static void main(String[] argv) {
    Vote2 v = new Vote2();
    v.startReport();
  }
}