import java.io.*;

public class ReadObject {

  public static void main(String args[])
                throws IOException, ClassNotFoundException {

    System.out.println("要讀取的學生成績檔檔名");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();         // 取得檔名字串

    int counter=0;                    // 用來記錄讀到的資料筆數
     double Esum = 0;  // 英文分數加總
    double Msum = 0;  // 數學分數加總
    double Jsum = 0;  // Java 分數加總
    Student ss = new Student();
 
    System.out.println("姓名\t英文\t數學\tJava\t平均");
    System.out.println("------------------------------------------");
 
    try (ObjectInputStream ois =                  // 建立物件輸入串流物件
      new ObjectInputStream(new FileInputStream(filename))){
      while (true) {
        ss = (Student) ois.readObject();
        counter++;

        Esum += ss.getE();
        Msum += ss.getM();
        Jsum += ss.getJ();

        System.out.println(ss.getN() + '\t' + ss.getE() + '\t' +
                           ss.getM() + '\t' + ss.getJ() + '\t' +
                           ss.getAvg());
      }
    }
    catch (EOFException e) {
      System.out.println("\n已從檔案 " + filename + " 讀取 " +
                         counter + " 筆學生資料");
      System.out.println("\n全員英文平均：" + (Esum/counter));
      System.out.println("全員數學平均：" + (Msum/counter));
      System.out.println("全員Java平均：" + (Jsum/counter));
    }
  }
}