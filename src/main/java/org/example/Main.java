package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("== 프로그램 시작22 ==");
        Scanner sc = new Scanner(System.in);

        System.out.printf("명령어)");
        String cmd = sc.next();
        System.out.printf("입력된 명령어 : %s\n", cmd);

        System.out.printf("명령어)");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.printf(" 입력된 명령어 : %d\n", num);

        sc.close();
        System.out.println("== 프로그램 끝22 ==");
    }
}