public class Main {

    public static void main(String[] args) {
//        int a =5;
//        int b =6;
//        int temp;
//
//        temp = a;
//        a = b; //a = 6 ,b =6 , temp =5
//        b = temp;
//
//        System.out.println(a);
//        System.out.println(b);

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int temp = arr[0];
        arr[0]=arr[3];
        arr[3]=temp;

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
