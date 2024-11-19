package com.example.calculator.Lv2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Exception exception = new Exception();
        AskContinue askContinue = new AskContinue();
        DecimalFormat df = new DecimalFormat();

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("첫번째 양의 정수를 입력해주세요(0포함)");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("사칙연산 기호(+, -, /, * 중 하나)를 입력해주세요");
            String operateType = scanner.nextLine();

            /* exception 클래스의 exception 메서드를
               통해 사칙연산이 올바르지 않다면 다시 처음으로 돌아감*/
            if (exception.exception(operateType)) {
                continue;
            }

            System.out.println("두번째 양의 정수를 입력해주세요(0포함)");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            double result = calculator.calculate(num1, num2, operateType);// Calculator 에서 계산된 결과를 출력
            if (Double.isNaN(result)) {
                System.out.println("다시 입력해주세요.");
                continue;
            }

            System.out.println("결과 : " + df.format(result)); //결과가 4.0 이처럼 뒤에 0인 경우 출력하지 않음
            calculator.queueAddInResult(result); // queue 에 결과를 저장한다
            if(askContinue.askContinue()){  //계산을 더 할 건지 물어보는 함수, exit 입력시 반복문 종료
                calculator.dequeuedValue(); // 가장 먼저 queue 에 저장된 값은 삭제함
                break;
            }
        }
    }
}

