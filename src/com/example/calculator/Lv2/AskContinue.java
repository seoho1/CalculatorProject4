package com.example.calculator.Lv2;

import java.util.Scanner;

public class AskContinue {
    Scanner scanner = new Scanner(System.in);
    public boolean askContinue() {
        System.out.println("더 계산하려면 아무키나 누르고 Enter를 눌러주세요.");
        System.out.println("(exit 입력시에 종료합니다)");
        String exitMessage = scanner.nextLine();

        // exit을 입력시에 프로그램 종료
        if (exitMessage.equals("exit")) {
            System.out.println("시스템을 종료합니다.");
            return true;
        } return false;
    }
}

