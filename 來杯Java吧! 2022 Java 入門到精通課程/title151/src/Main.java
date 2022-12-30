class Info2<T>{
    private T value;

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

class Info<T, K>{
    private T key;
    private K value;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}



public class Main {
    public static void a(){
        Info2<String> myInfo = new Info2<>();
        myInfo.setValue("Hello World");
        System.out.println(myInfo.getValue());
    }


    public static void main(String[] args) {
        Info<String, Integer>  myInfo = new Info<>();
        myInfo.setKey("Wilson");
        myInfo.setValue(3000);
        System.out.println(myInfo.getKey() + " " + myInfo.getValue());


    }
}