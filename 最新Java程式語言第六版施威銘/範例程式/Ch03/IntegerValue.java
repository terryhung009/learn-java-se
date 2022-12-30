public class IntegerValue {
  public static void main(String[] argv) {
    System.out.println("10進位 1357       = " + 1357);
  
    int i = 0b10011001 ; // int 型別, 2進位 
    System.out.println("2進位  0b10011001 = " + i);
    
    long l = 0XADEF; // long 型別, 16進位 
    System.out.println("16進位 0XADEF     = " + l);
    
    short s = 01357; // short 型別, 8進位
    System.out.println("8進位  01357      = " + s);
  }
}
