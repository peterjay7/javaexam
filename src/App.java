import com.pjc.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Parent p = new Parent();
        p.say();
        Parent p2 = new Child();
        p2.say();

        Calc cc = new Calc();
        System.out.println("add=" + cc.add(5, 16));

        StaticMethod.doSay();
        System.out.println(StaticMethod.doSum(12.1, 23.5));

    }
}
