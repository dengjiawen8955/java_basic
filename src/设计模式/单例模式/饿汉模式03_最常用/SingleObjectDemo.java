package 设计模式.单例模式.饿汉模式03_最常用;

/**
 * 作用：调用单例模式。
 */
public class SingleObjectDemo {
    public static void main(String[] args) {
        //1. 通过单例模式唯一的getInstance（）获取实例
        SingleObject instance = SingleObject.getInstance();
        //2. 使用获取的实例调用单例模式的方法》
        instance.printSomeText();
    }
}
