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
        // (out은 System 이 가지는 속성 <왜나면 ()가 없기 때문>, out 속성은 PrintStream 클래스임.
        // println()는 PrintStream의 메소드임. )

        StaticMethod.doSay(); // static 메소드 호출
        System.out.println(StaticMethod.doSum(12.1, 23.5));

        // 연습
        float ff = 1.2f; // f 생략불가
        double dd = 2.456789d; // d 생략가능 => 자바 실수는 double 이 디폴트

        final int ffi = 8;
        // ffi = 4; // final 이후에는 변경 불가

        System.out.println(" ff= " + ff + ", dd= " + dd + ffi);

    }
}
