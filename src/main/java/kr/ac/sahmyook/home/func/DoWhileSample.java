package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    public void addDashToken(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("문자열을 입력하세요 : ");
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i =0; i<s.length();i++){
                sb.append(s.charAt(i));
                if(i != s.length()-1) {
                    sb.append('-');
                }
            }
            System.out.println("결과 : "+sb.toString());
        }while(true);

    }
    public void burgerKingMenu(){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        StringBuilder sb = new StringBuilder();
        do {
            String[] menu = {"버거","아이스크림","콜라","감자튀김","치킨"};
            int[] price = {5000,1000,800,2000,10000};
            for(int i=1; i<= menu.length; i++){
                System.out.println(i+"."+menu[i-1]+" : "+price[i-1]);
            }
            System.out.print("구매하실 메뉴를 선택하세요.(완료시 5누르시오) : ");
            int pick = sc.nextInt();
            if(pick == 5){
                break;
            }
            sb.append(menu[pick-1]);
            sb.append(",");
            sum += price[pick-1];
        }while(true);
        System.out.println("메뉴 : "+ sb.toString());
        System.out.println("가격 : "+sum);
    }
    public void isStringAlphabet(){
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.print("문자열 : ");
            s = sc.nextLine();
            if (!s.equals("q")) {
                boolean isAllAlphabetic = true;
                for (int i = 0; i < s.length(); i++) {
                    if ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90 ||(int)s.charAt(i)>=97&&(int)s.charAt(i)<=122) {
                        isAllAlphabetic = true;
                    }else{
                        isAllAlphabetic = false;
                        break;
                    }
                }

                if (isAllAlphabetic) {
                    System.out.println("모든 글자가 영문자입니다.");
                } else {
                    System.out.println("영문자가 아닌 글자가 포함되어 있습니다.");
                }
        }
    }while (s.equals("q"));
}
}
