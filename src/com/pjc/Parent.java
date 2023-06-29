package com.pjc;

public class Parent {
    public void parentSay() { // 자식이 재정의 안할것
        System.out.println("this is ParentSay() : only for Parent");
    }

    public void OverSay() { // 자식이 재정의 해서 사용할것 : for Override
        System.out.println("this is OverSay() : Parent say...");
    }

}
