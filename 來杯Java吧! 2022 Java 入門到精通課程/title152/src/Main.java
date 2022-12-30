interface Content<T>{
    T text();

}



public class Main implements Content<Integer>{
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.text());
    }

    @Override
    public Integer text() {
        return 15;
    }
}