package Programmers;

import java.util.Stack;

public class Programmers_크레인인형뽑기 {
    public static void main(String[] args) {
        int [][] x = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] y = {1,5,3,5,1,2,1,4};
        int result = solution(x, y);

        System.out.println(result);
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size = board.length;
        Stack<Integer> items = new Stack<>();
        int item, tmp=0;

        for(int i=0; i<moves.length; i++){
            int move = moves[i]-1;

            for(int n=0; n<size; n++){
                item = board[n][move];
                if(item!=0){

                    if(tmp == item){
                        items.pop();
                        answer+=2;
                    }else{
                        items.push(board[n][move]);
                        board[n][move]=0;
                        tmp = items.peek();

                    }

                    break;
                }
            }

        }



        return answer;

    }
}
