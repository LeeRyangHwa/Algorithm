package Programmers;

public class Programmers_top {
	public static void main(String[] args) {
		int q[] = {3,9,9,3,5,7,2};
		int an[] = solution(q);
		
		for(int i=0; i<an.length; i++) {
			System.out.println(an[i]);
		}
		
	}
	
	//프로그래머스 알고리즘 스택, 큐 (문제: 탑)
	public static int[] solution(int[] heights) {
        int[] answer = {};
        int size = heights.length;
        answer = new int[size];
        
        for(int i=size-1;i>0; i--){
            
            for(int j=i-1; j>0; j--){
                if(heights[i]<heights[j]){
                    answer[i]=j+1;
                    break;
                }
            }
            
        }
        
        return answer;
    }
}