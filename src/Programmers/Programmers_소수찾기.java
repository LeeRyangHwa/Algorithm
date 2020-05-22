package Programmers;

public class Programmers_소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++){
            boolean check = true;
            for(int j = 2; j*j<=i; j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }
        }

        return answer;
    }
}
