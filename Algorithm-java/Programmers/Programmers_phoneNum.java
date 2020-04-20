package Programmers;

public class Programmers_phoneNum {
	public static void main(String[] args) {
		String q[] = {"119","97674223","1195524421"};
		boolean an = solution(q);
		
		System.out.println(an);
		
		
	}
	
	//프로그래머스 알고리즘 스택, 큐 (문제:전화번호부)
	 public static boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        for(String num:phone_book){
	            
	            for(String num2:phone_book){
	                
	                if(num==num2){
	                    continue;
	                }else{
	                    if(num.indexOf(num2)==0){
	                        answer = false;
	                        return answer;
	                    }
	                }
	            }
	            
	        }
	        return answer;
	    }
}
