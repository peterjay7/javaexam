import com.pjc.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, PJC...!");
        // (out은 System 이 가지는 속성 <왜나면 ()가 없기 때문>, out 속성은 PrintStream 클래스임.
        // println()는 PrintStream의 메소드임. )

        // 입력문자열 출력 <= 입력을 줄수 있을때 사용
        // System.out.println("args[0]= " + args[0] + "args[1]= " + args[1]);

        otherMd(); // static 함수는 호출 가능
        App ap = new App();
        ap.otherMd2(); // non-static은 객체 생성후 호출가능 => 이렇게 사용할 이유는 없음.

        Parent p = new Parent();
        p.parentSay();
        p.OverSay();

        Parent p2 = new Child();
        p2.OverSay();
        // p2.childSay(); // 부모타임으로 자식 메소드 호출 불가

        Child chd = (Child) p2; // 형 변환후 부를수 있음.
        chd.parentSay();
        chd.OverSay();
        chd.childSay();

        Calc cc = new Calc();
        System.out.println("add=" + cc.add(5, 16));

        StaticMethod.doSay(); // static 메소드 호출
        System.out.println(StaticMethod.doSum(12.1, 23.5));

        // 연습
        float ff = 1.2f; // f 생략불가
        double dd = 2.456789d; // d 생략가능 => 자바 실수는 double 이 디폴트

        final int ffi = 8;
        // ffi = 4; // final 이후에는 변경 불가

        System.out.println(" ff= " + ff + ", dd= " + dd + ffi);

    }

    public static void otherMd() {
        System.out.println("this is static other method...in main App class");
    }

    public void otherMd2() {
        System.out.println("this is non-static other method2...in main App class");
    }

}
