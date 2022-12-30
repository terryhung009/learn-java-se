public class Parens {
  public static void main(String[] argv) {
    int i = 1 + 3 * 5 + 7; // 先算 3*5
    System.out.println("1 + 3 * 5 + 7   = " + i);
		
    i = (1 + 3) * 5 + 7; // 先算 1+3
    System.out.println("(1 + 3) * 5 + 7 = " + i);
		
    i = 1 + 3 * (5 + 7); // 先算 5+7
    System.out.println("1 + 3 * (5 + 7) = " + i);
  }
}
