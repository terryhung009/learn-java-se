public class Main {
    //public <T> T func (T obj) {}
    public static <T> T printHello(T obj){
        return (T)(obj+ " , hello");

    }



    public static <T> void printClass(T obj){
        System.out.println(obj.getClass().getName());
    }



    public static void main(String[] args) {
        printClass("Hello world.");
        System.out.println(printHello("Wilson"));
    }
}