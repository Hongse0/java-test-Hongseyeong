package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);

        scanner.nextLine();

        System.out.print("문자열을 입력하세요: ");
        String stringValue = scanner.nextLine();
        System.out.println("입력한 문자열: " + stringValue);

        System.out.print("논리값을 입력하세요 (true 또는 false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("입력한 논리값: " + booleanValue);

    }
    public void testRandom(){
        Random rd = new Random();
        int intrand = rd.nextInt(50)+1;
        double doublerand = (rd.nextDouble()*50.0)+1.0;

        System.out.println("정수형 난수 : "+intrand);
        System.out.println("실수형 난수 : "+doublerand);
    }
}
