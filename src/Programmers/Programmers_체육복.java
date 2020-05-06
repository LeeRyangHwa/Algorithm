package Programmers;

public class Programmers_체육복 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int re_count=0;
        int count = 0;

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    re_count++;
                    break;
                }
            }
        }


        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1){

                    reserve[j]=-1;
                    count++;
                    break;
                }
            }
        }

        answer = n-lost.length+re_count+count;

        return answer;
    }


}
