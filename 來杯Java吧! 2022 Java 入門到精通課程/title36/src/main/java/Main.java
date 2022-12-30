public class Main {
    public static void printHi(int i){
        if(i==0){
            return;
        }
//        System.out.println("hi");

        System.out.println("We just enter printHi with i is  " + i);
        printHi(i - 1);
        System.out.println("We finished running printHi with i is " + i);
    }
    public static void main(String[] args) {
        //recursive method
        //a method calls itself

        printHi(10);




    }
}
