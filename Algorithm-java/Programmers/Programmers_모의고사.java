package Algorithm;
import java.util.*;

public class Programmers_모의고사 {
	
		
	    private static int c1 =0;
	    private static int c2 =0;
	    private static int c3 =0;
	    
	    private static int[] a1 = {1,2,3,4,5};
	    private static int[] a2 = {2,1,2,3,2,4,2,5};
	    private static int[] a3 = {3,3,1,1,2,2,4,4,5,5};
	    
	    public static void main() {
	    	int[] q = {1,2,3,4,5};
			int[] a = solution(q);
			for(int i:a) {
				System.out.print(i+" ");
			}
		}
	    
	    
	    public static int[] solution(int[] answers) {
	        List<Integer> list = new ArrayList<>();
	        int[] score = {0,0,0};
	        
	        for(int p : answers){
	            if(c1_value() == p){
	                score[0]++;
	            }
	            if(c2_value() == p){
	                score[1]++;
	            }
	            if(c3_value() == p){
	                score[2]++;
	            }
	        }
	        
	        int top = 0;
	        for(int i :score){
	            if(i>top){
	                top = i;
	            }
	        }
	        
	        
	        for(int i=0; i<3; i++){
	            if(score[i]==top){
	                list.add(i);
	            }
	        }
	        
	        int[] answer = new int[list.size()];
	        for(int i=0;i<answer.length; i++){
	            answer[i] = list.get(i)+1;    
	        }
	        
	        return answer;
	    }
	    
	    
	    private static int c1_value(){
	        int value = a1[c1];
	        c1++;
	        if(c1>=a1.length)
	            c1 = 0;
	        return value; 
	    }
	    private static int c2_value(){
	        int value = a2[c2];
	        c2++;
	        if(c2>=a2.length)
	            c2 = 0;
	        
	        return value; 
	    }
	    private static int c3_value(){
	        int value = a3[c3];
	        c3++;
	        if(c3>=a3.length)
	            c3 = 0;
	        
	        return value; 
	    }
	
}
