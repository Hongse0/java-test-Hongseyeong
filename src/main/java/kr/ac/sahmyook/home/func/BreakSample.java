package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak(){
        int sum =0;
        int i =1;
        while(true){
            sum +=i;
            i++;
            if(i==101){
                break;
            }
        }
        System.out.println("1부터 100까지의 합 : "+sum);
    }
    public void guguDanBreak() {
        for(int i =1; i<10; i++){
            for(int j=1; j<10; j++){
                if(j==5){
                    break;
                }
                System.out.println(i+" * "+j+"="+(i*j));
            }
        }

    }
}
