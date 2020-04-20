package Programmers;
import java.util.*;

public class Programmers_printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q[] = {2,1,3,2};
		int an = solution(q,2);
		
		System.out.println("기댓값: "+an);
	}
	public static int solution(int[] priorities, int location) {
        int answer = 1;
        
        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int value : priorities){
            priority.offer(value);
        } 
        
        while(!priority.isEmpty()){
            for(int i = 0; i< priorities.length; i++){
                if((int)priority.peek() == priorities[i]){
                    if(i == location){
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}
