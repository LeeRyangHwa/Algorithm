package Programmers;
import java.util.*;

public class Programmers_Ramen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int q1[] = {4,10,15};
		int q2[] = {20,5,10};
		int an = solution(4,q1,q2,30);

	}
	//다시 확인하기 ( 틀렸던 문제 ) 
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        int index = 0;
        
        for (int i = 0; i < k; i++) {
            if(index < dates.length && i == dates[index])
                q.add(supplies[index++]);

            if(stock == 0) {
                stock += (int)q.poll();
                answer++;
            }
            stock -= 1;
        }
        return answer;
    }
}
