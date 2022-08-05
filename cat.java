package 猫和狗多态实现;

public class cat extends Animal{
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void drink() {
        System.out.println("猫喝牛奶");
    }
}
