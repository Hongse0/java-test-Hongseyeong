package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class WhileSample {
    public void printUniCode(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("문자 : ");
            char c = sc.next().charAt(0);
            if(c=='0'){
                System.out.println("종료");
                break;
            }else{
                System.out.println("유니코드 : " + ((int)c));
            }
        }
    }
    public  void sum1To100(){
        int sum = 0;
        int i =1;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println("1부터 100 까지 합계 : "+ sum);
    }
    public  void  numberGame(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int nan  = rd.nextInt(100)+1;
        while (true){
            System.out.print("맞춰봐 : ");
            int guess = sc.nextInt();
            if(guess>nan){
                System.out.println("답은 더 작아.");
            }else if(guess<nan){
                System.out.println("답은 더 커.");
            }else{
                System.out.println("정답을 맞췄습니다.");
                break;
            }
        }
    }
    public  void countCharacter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        String s = sc.nextLine();
        System.out.println("글자 개수 : "+ s.length());

    }
    public  void countInChar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        String s = sc.nextLine();
        System.out.print("문자 입력 : ");
        char c = sc.next().charAt(0);
        int i =0;
        int cnt =0;
        while (i < s.length()) {
            if (c == s.charAt(i)) {
                cnt++;
            }
            i++;
        }
        System.out.println("문자 개수 : "+cnt);
    }
}
