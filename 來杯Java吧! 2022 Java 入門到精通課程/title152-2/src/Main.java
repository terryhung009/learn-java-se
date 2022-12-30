interface Content<T>{
    T text();

}

class GenericsContent<T> implements Content{

    private T text;

    public GenericsContent(T text){
        this.text = text;
    }

    @Override
    public Object text() {
        return text;
    }
}


public class Main {
    public static void main(String[] args) {
        GenericsContent<String> gt = new GenericsContent<>("Hello world");
        System.out.println(gt.text());;
    }

}