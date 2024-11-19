package com.example.calculator.Lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.println("첫번째 양의 정수를 입력해주세요(0포함)");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("사칙연산 기호(+, -, /, * 중 하나)를 입력해주세요");
            String operateType = scanner.nextLine();

            // 올바르게 사칙연산 입력했는지 확인해보기
            if (!(operateType.equals("+") || operateType.equals("-") || operateType.equals("*") || operateType.equals("/"))) {
                System.out.println("올바른 사칙연산을 입력해주세요");
                continue;
            }

            System.out.println("두번째 양의 정수를 입력해주세요(0포함)");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            double result = 0;

            switch(operateType) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if(num2 == 0) {   // 사칙연산 오류시에 처음으로 돌아가서 다시 입력받음
                        System.out.println("분모가 0이면 나눌 수 없습니다.");
                        System.out.println("처음으로 돌아갑니다.");
                        continue;
                    }

                    result = (double) num1 / (double) num2;

                    break;
            }
            System.out.println("결과 : " + result);
            System.out.println();
            System.out.println("더 계산하려면 아무키나 누르고 Enter를 눌러주세요.");
            System.out.println("(exit 입력시에 종료합니다)");
            String exitMessage = scanner.nextLine();

            // exit을 입력시에 프로그램 종료
            if(exitMessage.equals("exit")) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}

