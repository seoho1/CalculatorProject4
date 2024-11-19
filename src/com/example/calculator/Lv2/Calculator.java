package com.example.calculator.Lv2;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    DecimalFormat df =  new DecimalFormat();

    private double result = 0;
    private Queue<Double> queue = new LinkedList<>();

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



    public double calculate(int FirstNumber, int SecondNumber, String operateType) {
        switch (operateType) {
            case "+":
                result = FirstNumber + SecondNumber;
                break;

            case "-":
                result = FirstNumber - SecondNumber;
                break;

            case "*":
                result = FirstNumber * SecondNumber;
                break;

            case "/":
                if (SecondNumber == 0) {
                    System.out.println("분모가 0이면 나눌 수 없습니다.");
                    return Double.NaN; // 계산 불가능한 경우 NaN 반환
                }
                result =  (double) FirstNumber / SecondNumber;
                break;
        }  return result;
    }
}