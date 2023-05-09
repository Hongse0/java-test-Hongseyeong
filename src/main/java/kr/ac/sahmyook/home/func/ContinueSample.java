package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("결과 : " + sum);
    }

    public void rowColJump() {
        int[][] chart = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < chart.length; i++) {
            for (int j=0; j<chart[0].length;j++){
                if(i==0&&(j>=3&&j<=5)){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(chart[i][j]);
            }
            System.out.println(" ");
        }
    }
}
