class PollingStation extends Thread { // 開票所
  static int reportTimes = 5; // 回報次數
  int total = 0; // 此開票所總票數
  Assistant a; // 記票助理物件
  String name; // 開票所名稱

  public PollingStation(Assistant a,String name) { // 建構方法
    this.a = a; // 記錄Vote2物件
    this.name = name; // 記錄開票所名稱
  }

  public void run() { // 執行緒要進行工作
    for(int i = 0;i < reportTimes;i++) { // 回報5次得票
      //以亂數產生新增得票數
      int count = (int)(Math.random() * 500);
      a.reportCount(name,count); // 回報新增得票數並加總
      total += count; // 此開票所加總
    }
  }
}

class Assistant {
  // 是否有得票數未加總
  private boolean unprocessedData = false;
  private int count; // 新增的得票數
  private String name; // 開出新增得票數的開票所

  public void reportCount(String name,int count) {
    while(unprocessedData) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }

    System.out.println(name + "開票所新增" + count + "票");
    this.count = count;
    this.name = name;
    unprocessedData = true;
    notify();
  }

  public int getCount() {
    while(!unprocessedData) {
      try {
        wait();
      } catch(InterruptedException e) {}
    }

    int value = count;
    unprocessedData = false;
    notify();
    return value;
  }
}
                
public class Vote5 {
  static int total = 0; // 總開票數
  static int numOfStations = 2; // 開票所數
  static PollingStation[] stations;

  public static void main(String[] argv) {
    // 建立助理物件
    Assistant a = new Assistant();

    // 建立陣列
    stations = new PollingStation[numOfStations];

    // 一一建立投票所物件，並且執行
    for(int i = 1;i <= numOfStations;i++) {
      stations[i - 1] = new PollingStation(a,i + "號");
    }

    // 一一啟動執行緒
    for(int i = 0;i < numOfStations;i++) {
      stations[i].start();
    }

    for(int i = 0;
      i < numOfStations * PollingStation.reportTimes;i++) {
      total += a.getCount(); // 讀取票數
      System.out.println("目前總票數：" + total);
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
}                       
