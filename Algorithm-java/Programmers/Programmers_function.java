package Algorithm;
import java.util.*;


public class Programmers_function {

	public static void main(String[] args) {
		int[] q ={93,30,55};
		int[] q1 = {1,30,5};
		int[] an = solution(q,q1);
		
		System.out.println(an);
		
		
	}
	
	//프로그래머스 알고리즘 스택, 큐 (문제: 기능개발)
	public static int[] solution(int[] progresses, int[] speeds) {
	     int[] answer = {};
	        ArrayList<Integer> finish = new ArrayList<>();
	        
	        int work = 0;
	        
	        while(work < progresses.length){
	        	int num=0;
	        	
	            for(int i=work; i<progresses.length; i++){
	                progresses[i] = progresses[i]+speeds[i];
	              
	            }
	            
	            for(int i=work; i<progresses.length; i++) {
	            	if(progresses[work]>=100) {
	            		work++;
	                	num++;
	            	}
	            	else {
	            		break;
	            	}
	            }
	            
	            if(num!=0) {
	            	finish.add(num);
	            }     
	        }
	        
	        answer = new int[finish.size()];
	        
	        int i =0;
	        for(int x:finish){
	        	answer[i] = x;
	        	i++;
	        }
	        
	        return answer;
	    }

}
