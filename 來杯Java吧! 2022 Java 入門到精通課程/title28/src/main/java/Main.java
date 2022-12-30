public class Main {
    public Main(){

    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Main m = new Main();

        System.out.println(m.multiply(5,4));

        m.sayHello();
    }
}
