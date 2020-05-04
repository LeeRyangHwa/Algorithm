package Programmers;

public class Programmers_두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        int x , y;

        if(a < b){
            x = a;
            y = b;
        }else{
            x = b;
            y = a;
        }

        for(long i=x; i<=y; i++){
            answer += i;
        }

        return answer;
    }
}
