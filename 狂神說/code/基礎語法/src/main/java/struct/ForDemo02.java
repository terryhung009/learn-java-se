package struct;

public class ForDemo02 {
    //練習1 : 計算1~100之間的奇數和與偶數和
    public static void main(String[] args) {
       int oddSum=0;
       int evenSum=0;

       for (int i = 0; i <= 100; i++) {
            if(i%2!=0){//奇數
                oddSum+=i;//oddSum = oddSum + i
            }if(i%2==0){//偶數
                evenSum+=i;
           }
        }
        System.out.println("奇數的和: " +oddSum);
        System.out.println("偶數的和: " +evenSum);



    }
}
