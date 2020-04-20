package Algorithm;

import java.util.*;
public class Programmers_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q[] = {1,2,3,2,3};
		int an[] = solution(q);
		
		for(int i=0; i<an.length; i++) {
			System.out.println(an[i]);
		}
	}
	public static int[] solution(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }
}
