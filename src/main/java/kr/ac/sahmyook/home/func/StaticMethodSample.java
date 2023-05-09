package kr.ac.sahmyook.home.func;

import java.util.Random;

public class StaticMethodSample {
    public void testMathRandom(){
        int i = (int)(Math.random()*45)+1;
        System.out.println("1~45사이의 임의의 정수 출력 : "+i);
    }
    public void testMathAbs(){
        double k = -12.77;
        System.out.println("절대값 : "+Math.abs(k));
    }
    public void testMathMax(){
        int i =120;
        int j=54;
        System.out.println("둘 중에 큰 값 : "+ Math.max(i,j));
    }
}
