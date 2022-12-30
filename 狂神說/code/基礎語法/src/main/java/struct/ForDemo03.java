package struct;

public class ForDemo03 {

    public static void main(String[] args) {
        //練習2 : 用while或fo6循環輸出1-1000之間能被5整除的數，並且每行輸出3個

        for (int i = 0; i <= 1000; i++) {
            if(i % 5 ==0){//被5整除
                System.out.print(i+"\t");
            }
            if(i%(5*3)==0){//換行
                System.out.println("");
//                System.out.println("\n");//另一種換行
            }
            //print 輸出完不會換行
            //println  輸出完會換行
        }
    }
}
