public class Main {
    public static void changeA(int x){
        x=20;
    }



    public static void main(String[] args) {
//        int a =10;
//        changeA(a);
//        System.out.println(a);

        int[] myArray1 = {10,20,30};
        int[] myArray2 = myArray1;
        myArray1[0]=100;
        for(int i :myArray1){
            System.out.print(i+ " ");
        }
        for(int i :myArray2){
            System.out.print(i+ " ");
        }
    }
}
