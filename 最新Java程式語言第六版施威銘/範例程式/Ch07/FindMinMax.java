public class FindMinMax {

  public static void main(String[] argv) {
    int[] temp = {21,18,21,23,25,25,24,22,22,16}; // 溫度
    int min = temp[0]; // 先將最低溫度設為任一個元素
    int max = temp[0]; // 先將最高溫度設為任一個元素

    for(int i : temp) { // 一一比較每個元素值
      if(i < min){
        min = i; // 更新最低溫度
      }
      if(i > max) {
        max = i; // 更新最高溫度
      }
    }

    System.out.println("全台目前最低的溫度是：" + min + "度");
    System.out.println("全台目前最高的溫度是：" + max + "度");
  }
}
