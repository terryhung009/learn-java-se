package struct;

public class ForDemo01 {

//示範while循環與for循環
    public static void main(String[] args) {
        int a =1;  //初始化條件

        while(a<=100){//條件判斷
            //循環體
            System.out.println(a);
            a+=2;//迭代

        }
        System.out.println("while循環結束!");
        //初始化條件//條件判斷//迭代
        for(int i =1;i<=100;i++){
            System.out.println(i);

        }
        System.out.println("For循環結束");

        /*
        關於for循環有以下幾點說明:
        最先執行初始化步驟。可以聲明一種類型，但可初始化一個或多個控制變量，也可以空語句。
        然後檢測布爾表達式的值，如果true，循環體被執行，如果false，循環終止，開始執行循環體後面的語句
        執行一次循環後，更新循環控制變量，(迭代因子控制循環變量的增減)。
        再次執行檢測布爾值，循環執行上面的過程。
         */

        //合法的for循環//死循環
        for( ; ; ){

        }
    }
}
