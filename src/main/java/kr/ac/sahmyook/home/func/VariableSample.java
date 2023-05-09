package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myprofile(){
        String name = "홍세영";
        int age = 26;
        int stuNum = 2018101018;
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("학번 : "+stuNum);

    }
    public void empInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("사원 이름 : ");
        String empName = sc.nextLine();
        System.out.print("사원 나이 : ");
        int empAge = sc.nextInt();
        System.out.print("사원 번호 : ");
        int empNum = sc.nextInt();

        System.out.println("사원 이름 : "+empName);
        System.out.println("사원 나이 : "+empAge);
        System.out.println("사원 번호 : "+empNum);
    }
}
