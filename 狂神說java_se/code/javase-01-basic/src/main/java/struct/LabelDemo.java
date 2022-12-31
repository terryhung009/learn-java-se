package struct;

public class LabelDemo {
    public static void main(String[] args) {
        //打印101~150所有質數
        //質數 : 只在大於1的自然數中，除了1與本身以外不再有其他因數的自然數
        int count =0;
        //不建議使用
        outer:for(int i =101;i<150;i++){
            for (int j =2;j<i/2;j++){
                if(i % j ==0){
                    continue outer;

                }
            }
            System.out.print(i+" ");
        }


    }

}
