package com.pjc;

public class Child extends Parent {

    @Override
    public void OverSay() { // 상속받은 메소드 제정의
        System.out.println("this is OverSay() : Child say...");
    }

    public void childSay() { // 자식에만 있는 메소드
        System.out.println("this is childSay() : only for Child");
    }
}
