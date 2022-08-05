package 猫和狗多态实现;

public class AnimalDemo {
    public static void main(String[] args) {
//        子承父，编译看左边，执行看右边
//        无参构造
        Animal a = new cat();
        a.setName("加菲");
        a.setAge(10);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


//        带参构造
        a = new cat("加菲",10);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

//        父承子,转换
       cat c = (cat)a;
       c.drink();
    }
}
