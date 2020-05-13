package Programmers;

public class Programmers_124나라의숫자 {
    public String solution(int n) {
        String answer = "";

        while(n>0){
            if(n<3){
                answer = Calculation_n(n)+answer;
                break;
            }
            int tmp = n%3;
            answer = Calculation_n(tmp)+answer;


            if(n/3==1&&n%3==0){
                n=0;
            }else if(n%3==0){
                n=n/3-1;
            }else{
                n=n/3;
            }
        }

        System.out.println(answer);

        return answer;
    }
    public String Calculation_n(int x){
        String num="";
        if(x==1){
            num="1";
        }else if(x==2){
            num="2";
        }else{
            num="4";
        }
        return num;
    }
}
