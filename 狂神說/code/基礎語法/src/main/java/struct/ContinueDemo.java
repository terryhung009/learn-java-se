package struct;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while(i<100){
            i++;
            if(i%10==0){
                System.out.println();
                continue;
            }
            System.out.print(i+" ");
        }
        /*
        break在任何循環語句的主體部分，均可用break控制循環的流程。
        break用於強行退出循環，不執行循環中剩餘的語句，(break語句也在switch語句中使用)

        continue 語句用在循環語句體中，用於終止某次循環過程，及跳過循環體中尚未執行的語句，
        接著進行下一次是否執行循環的設定
         */

    }
}
