package oop.demo07;

public class Person {

    //2.賦初始值
    {
        //代碼塊(匿名代碼塊)

        System.out.println("匿名代碼塊");

    }
    //1.只執行一次
    static {
        //代碼塊(靜態代碼塊)

        System.out.println("靜態代碼塊");

    }
    //3.
    public Person(){

        System.out.println("構造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("==============");
        Person person2 = new Person();
    }


}
