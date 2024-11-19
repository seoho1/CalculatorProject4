package com.example.calculator.Lv2;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    double result = 0;
    Queue<Double> queue = new LinkedList<>();
    DecimalFormat df =  new DecimalFormat();
    public void queueAddInResult(double result){
        queue.add(result);
        System.out.print("저장된 값: ");
        for (Object calculated :queue ) {
            System.out.print(df.format(calculated)+ " ");
        }
        System.out.println(); //줄 띄움
    }

    public void dequeuedValue(){
        System.out.println("가장 먼저 저장된 값 삭제: " + df.format(queue.poll()));
    }



    public double calculate(int FistNumber, int SecondNumber, String operateType) {
        switch (operateType) {
            case "+":
                result = FistNumber + SecondNumber;
                break;

            case "-":
                result = FistNumber - SecondNumber;
                break;

            case "*":
                result = FistNumber * SecondNumber;
                break;

            case "/":
                result =  (double) FistNumber / SecondNumber;
                break;
        }  return result;
    }
}