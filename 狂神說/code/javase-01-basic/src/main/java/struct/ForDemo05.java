package struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};//定義了一個數組


        //遍歷數組的元素
        for(int n: numbers){
            System.out.println(n);
        }
        System.out.println("=====================");
        //相當於
        for(int i =0;i<5;i++){
            System.out.println(numbers[i]);
        }
    }


}
