package 泛型;

public class Test {

    //吃什么
    public <T extends Animal> void eatWhat(T t) {
        t.eat();
    }



    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }


}
