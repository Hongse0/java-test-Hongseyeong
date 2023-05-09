package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int b = sc.nextInt();
        System.out.print("연산 문자 : ");
        char c = sc.next().charAt(0);

        switch (c){
            case '+':
                System.out.println("결과 : "+ (a+b));
                break;
            case '-':
                System.out.println("결과 : "+ (a-b));
                break;
            case '*':
                System.out.println("결과 : "+ (a*b));
                break;
            case '/':
                System.out.println("결과 : "+ (a/b));
                break;
            case '%':
                System.out.println("결과 : "+ (a%b));
                break;
            default:
                System.out.println("잘못된 연산 문자입니다.");

        }
    }

    public void fruitPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("과일이름 : ");
        String fruitName = sc.nextLine();
        switch (fruitName){
            case "딸기":
                System.out.println("가격 : 10000");
                break;
            case "사과":
                System.out.println("가격 : 12000");
                break;
            case "오렌지":
                System.out.println("가격 : 8000");
                break;
            default:
                System.out.println("잘못된 과일 이름입니다.");
        }
    }
}
