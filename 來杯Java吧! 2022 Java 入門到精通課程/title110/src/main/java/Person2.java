public class Person2 {
    private String name;
    private int age;
    private String major;
    private double gpa;

    public String getName() {
        return name;
    }

    public Person2 setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;

    }

    public Person2 setAge(int age) {
        this.age = age;
        return this;
    }

    public String getMajor() {
        return major;
    }

    public Person2 setMajor(String major) {
        this.major = major;
        return this;
    }

    public double getGpa() {
        return gpa;
    }

    public Person2 setGpa(double gpa) {
        this.gpa = gpa;
        return this;
    }
}
