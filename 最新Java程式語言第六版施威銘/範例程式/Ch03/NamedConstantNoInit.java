public class NamedConstantNoInit {
  public static void main(String[] argv) {
    double r = 3.0;  //半徑
    final double PI; // 圓周率
    PI = 3.14;       // 設定初值
    System.out.println("圓周：" + 2 * PI * r);
    System.out.println("面積：" + PI * r * r);
  }
}
