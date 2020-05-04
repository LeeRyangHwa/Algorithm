package Programmers;

public class Programmers_체육복 {

        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;

            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(lost[i]==reserve[j]){
                        lost[i]=0;
                        reserve[j]=0;
                    }
                }
            }

            int loststu=0;
            //int r=0;

            for(int i=0; i<lost.length; i++){
                int check=0;
                int lostnum = lost[i];
                if(lostnum!=0){
                    for(int j=0; j<reserve.length; j++){
                        if(lostnum == reserve[j]-1||reserve[j]+1==lostnum){
                            reserve[j]=0;
                            check=1;
                        }
                    }
                }
                if(check!=1){
                    loststu++;
                }
            }

            for(int l: lost){
                System.out.print(l+" ");
            }
            System.out.println("");
            for(int r: reserve){
                System.out.print(r+" ");
            }

            System.out.println("");
            System.out.println(loststu);
            return answer;
        }


}
