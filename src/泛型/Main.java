package 泛型;

public class Main {
    /**
     * 方法的引用 Integer::sum
     * 引用处必须是函数式接口
     * 被引用的方法必须已经存在
     * 被引用方法的形参和返回值需要跟抽象方法保持一致
     * 被引用方法的功能要满足当前需求
     *
     *
     */

    // 定义一个泛型方法用于加法运算
    public static <T extends Number> T add(T a, T b, Adder<T> adder) {
        T result = adder.add(a, b);
        System.out.println(a + "+" + b + "=" + result);
        return result;
    }

    // 定义一个加法运算的接口
    public interface Adder<T> {
        T add(T a, T b);
    }

    public static void main0(String[] args) {
        // 对不同类型的加法运算进行测试
        //方法的引用 Integer::sum
        add(1, 2, Integer::sum);                 // Integer 加法
        add(1.5f, 2.5f, Float::sum);             // Float 加法
        add(1.5, 2.5, Double::sum);              // Double 加法


          Test test=new Test();
          test.eatWhat(new Dog());
          test.eatWhat(new Cat());


    }





}
