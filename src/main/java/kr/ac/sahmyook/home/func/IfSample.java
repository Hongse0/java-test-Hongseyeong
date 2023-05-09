package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    public void maxNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int i1 = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int i2 = sc.nextInt();
        if(i1>i2){
            System.out.println("큰값 : "+ i1);
        }else if(i1==i2){
            System.out.println("두 수가 같음.");
        }else{
            System.out.println("큰값 : "+i2);
        }
    }
    public void minNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int k1 = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int k2 = sc.nextInt();
        if(k1>k2){
            System.out.println("작은 값 : "+ k2);
        }else if(k1==k2){
            System.out.println("두 수가 같음.");
        }else{
            System.out.println("작은값 : "+k1);
        }

    }
    public void threeMaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int j1 = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int j2 = sc.nextInt();
        System.out.print("세번째 정수 : ");
        int j3 = sc.nextInt();

        int max = j1;
        if(j2>max){
            max = j2;
        }
        if(j3>max){
            max = j3;
        }
        System.out.println("가장 큰수 : "+max);

        int min = j1;
        if(min>j2){
            min = j2;
        }
        if(min>j3){
            min = j3;
        }
        System.out.println("가장 작은수 : "+ min);
    }
    public void checkEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int i1 = sc.nextInt();
        if(i1%2==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

    }
    public void isPassFail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        int kor = sc.nextInt();
        System.out.print("수학 점수: ");
        int math = sc.nextInt();
        System.out.print("영어 점수 : ");
        int eng = sc.nextInt();
        double avg = (kor+math+eng) / 3;
        if(avg>=70) {
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }
    }
    public void scoreGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 : ");
        int score = sc.nextInt();
        if(score<60){
            System.out.println("학점 : F");
        }else if(score>=60 && score<70){
            System.out.println("학점 : D");
        }else if(score>=70 && score<80){
            System.out.println("학점 : C");
        }else if(score>=80 && score<90){
            System.out.println("학점 : B");
        }else{
            System.out.println("학점 : A");
        }

    }
    public void checkPlusMinusZero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int one = sc.nextInt();
        if(one ==0){
            System.out.println("0입니다");
        }else if(one>0){
            System.out.println("양수입니다.");
        }else{
            System.out.println("음수입니다.");
        }

    }
    public void whatCaracter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 : ");
        char c = sc.next().charAt(0);
        if((int)c>=65 && (int)c<=90){
            System.out.println("영어 대문자 입니다.");
        }else if((int)c>=97 && (int)c<=122){
            System.out.println("영어 소문자 입니다.");
        }else{
            System.out.println("알파벳이 아닙니다.");
        }
    }

}
