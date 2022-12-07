public class Main {
    //使用二維array，內部迴圈指針從1~9將全部元素遍歷
    // ex: 第一輪 //1*1,1*2,1*3…1*9 , 外部迴圈指針控制遍歷的圈數，
    // 所以程式共執行9次//(1~9)*9輪(1~9)共81次

    /**
     *
     */
    public static void ninetable(){
        for(int i = 1;i < 10;i++){
            for(int j = 1;j < 10 ; j++){
                System.out.println( i +" * " +j +" = " + i * j);
            }
        }
    }
    public static void main(String[] args) {
        ninetable();
    }
}
