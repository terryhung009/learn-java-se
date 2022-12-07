package struct;

public class TestDemo {
    //打印三角形 5行
    //從直的分割三角形
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            //畫出左半邊空白
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            //劃出左半邊*號
            for(int j=1; j <=i ; j++ ){
                System.out.print("*");
            }
            //劃出右半邊*號
            for(int j=1;j <i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    




}
