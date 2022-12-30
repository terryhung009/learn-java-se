public class Main {
    public static void main(String[] args) {
        Person wilson = new Person("wilson",25);
        Person grace = new Person ("Grace",25);
        wilson.setSpouse(grace);
        wilson.talk();
    }
}
