package com.example.calculator.Lv2;

public class Exception {
    public boolean exception(String operate){
        //사칙연산을 매개변수로 받아 사칙연산을 제대로 입력했는지 검증함
        if(!(operate.equals("+") || operate.equals("-") || operate.equals("*") || operate.equals("/"))) {
            System.out.println("잘못된 사칙연산 기호입니다");
            return true;
        } return false;
    }
}
