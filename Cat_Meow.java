// 定义Person类，表示人类
class Person {
    String name;  // 姓名属性
    
    // 设置姓名的方法
    void setName(String pname) {
        name = pname;  // 将传入的姓名赋值给当前对象的name属性
    }
}

// 定义Cat类，表示普通猫
class Cat {
    // 注释掉的私有属性（未使用）
    //private int age;
    //private String name;
    //private double life;

    // 猫咬人的方法
    void bite(Person p) {
        System.out.println("the cat bite sb " + p.name);  // 输出被咬的人名
    }

    // 猫的进食方法
    void eat() {
        System.out.println("the cat is eating");  // 普通猫的进食行为
    }

    // 猫的叫唤方法
    void bark() {
        System.out.println("miaomiaomiao");  // 普通猫的叫声
    }
}

// 定义NewCat类，继承自Cat类，表示特殊的新品种猫
class NewCat extends Cat {
    // 重写父类的eat方法
    void eat() {
        System.out.println("the cat is eating");  // 保持与父类相同的进食行为
    }
    
    // 重写父类的bark方法
    void bark() {
        // 新品种猫的特殊叫声
        System.out.println("ooaaeieiaaooeieiaaoodegedegedegeDuangDuangDuangDuang");
    }
}

// 主程序类
public class Cat_Meow {
    public static void main(String[] args) {
        // 打印测试信息
        System.out.println("my second java test");
        System.out.println("Hello, cat");

        // 创建普通猫对象
        Cat d = new Cat();
        // 创建人对象
        Person p = new Person();
        p.setName("Tom");  // 设置人名
        d.bite(p);  // 猫咬人
        d.eat();    // 猫进食
        d.bark();   // 猫叫唤

        // 创建新品种猫对象
        NewCat TJJ = new NewCat();
        // 循环调用新品种猫的叫唤方法6次
        for(int i=0; i<=5; i++) {
            TJJ.bark();
        }
        TJJ.eat();  // 新品种猫进食
    }
}