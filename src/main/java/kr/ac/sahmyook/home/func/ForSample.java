package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    public void sum1To10(){
        int sum =0;
        for(int i=0; i<=10; i++){
            sum +=i;
        }
        System.out.println("1~10까지 정수들의 합 : "+sum);
    }
    public void sumEven1To100(){
        int sum =0;
        for(int i=1; i<=100; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("1~100까지 짝수들의 합 : "+sum);
    }
    public void  oneGugudan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 :");
        int k = sc.nextInt();
        for(int i =1; i<10; i++){
            System.out.println(k+"*"+i+"="+(i*k));
        }
    }
    public void sumMinToMax(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int b = sc.nextInt();
        int sum =0;
        for(int i =a; i<=b; i++){
            sum += i;
        }
        System.out.println("작은 값부터 큰값 까지의 합계 : "+sum);
    }
    public void printStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("줄수 : ");
        int a = sc.nextInt();
        System.out.print("칸수 : ");
        int b = sc.nextInt();
        int star = a/b;
        for(int i=0; i<star; i++){
            System.out.print("* ");
        }
    }
    public void printNumberStar(){
        for(int i =1; i<8; i++){
            for(int j=1; j<8; j++){
                if(i==j){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public void printTriangleStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("줄수 : ");
        int a = sc.nextInt();
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (a < 0) {
            a = -a;
            for (int i = a; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public void guguDan(){
        for(int i=2; i<=9;i++){
            for(int j=1; j<=9; j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }

    }

}
