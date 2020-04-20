package Algorithm;
import java.util.*;
public class Programmers_moreSpicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q = {1,2,3,9,10,12};
		int an = solution(q,7);
		
		System.out.println(an);
	}
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        int sum = 0;

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int s : scoville){
            q.add(s);
        }
        
        while(q.peek() < K){
            if(q.size()>1){
                int x = q.poll();
                int y = q.poll();
                
                sum = x+(y*2);
                q.add(sum);
                answer++;
            }else{
                answer = -1;
                break;
            }
            
        }
        
        return answer;
    }
}
