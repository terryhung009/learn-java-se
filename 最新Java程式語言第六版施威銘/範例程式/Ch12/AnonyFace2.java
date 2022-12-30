interface Face {   // 定義 Face 介面
   void smile(); 
}

public class AnonyFace2 {
  public static void main(String[] argv) {

    new Face() { 
       public void smile()   
         { System.out.print("^_^"); }
    }.smile(); 
  }
}
