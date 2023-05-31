import com.pjc.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Parent p = new Parent();
        p.say();
        Parent p2 = new Child();
        p2.say();

    }
}
