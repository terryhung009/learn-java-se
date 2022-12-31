import java.util.Scanner;

public class Main {
    /**
     *
     *
     *
     * @return
     */
    public static void getDistance(){
        double result = 0;
        double height = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("請輸入高度height的數字(輸入0結束程式)；  ");
            height = sc.nextInt();
            if (height == 0){
                break;
            }
            System.out.print("請輸入次數n的數字；  ");
            n = sc.nextInt();


//            if(n == 1){
//               result += height / n;
//               System.out.println("第 "+ n +"  次落下總共經過 " + result +" 公尺 ");
//               break;
//             }
            result = height;
            for(int k =2;k<=n;k++){
                result +=  2 * (height / Math.pow(2,(k-1))) ;
            }

            System.out.println("在 "+height+" 公尺處落下 ，第 "+ n +"  次落下總共經過 " + result +" 公尺 ");

        }


    }




    public static void main(String[] args) {
        getDistance();
    }
}