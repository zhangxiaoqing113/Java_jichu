package 构造函数;

public class Main {
    public static void main0(String[] args) {
        Cat cat=new Cat();
        cat.addData("cat");
        Dog dog =new Dog();
        dog.addData("dog");
        dog.traversal();
        cat.traversal();
    }
}
