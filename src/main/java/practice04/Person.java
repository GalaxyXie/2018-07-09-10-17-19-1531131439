package practice04;

public class Person {
    private String name;
    private int age;

    public String introduce() {

        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String basicIntroduce(){
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
