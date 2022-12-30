public class MinMax {

  public static void main(String args[]) {

    System.out.println("Math.min()、Math.max() 示範");
    int i=100;   double a = 0.082;
    int j=37;    double b = 331.39;
    int k=399;   double c = 3.14;

    System.out.println("整數組最大的數字是：" +
                        Math.max(Math.max(i,j), k));
    System.out.println("浮點數組最小的數字是：" +
                        Math.min(Math.min(a,b), c));
  }
}
