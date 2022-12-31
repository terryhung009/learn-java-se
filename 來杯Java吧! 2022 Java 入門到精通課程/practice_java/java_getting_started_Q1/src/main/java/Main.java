public class Main {
    public static void printEvery3(){
        int number =1;
        while(true){
            if(number > 88){
                break;
            }
            System.out.println(number);
            number+=3;
        }
    }


    public static void main(String[] args) {
        printEvery3();
    }
}
