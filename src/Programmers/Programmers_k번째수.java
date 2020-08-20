package Programmers;

import java.util.*;

public class Programmers_k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        answer = new int[commands.length];

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<commands.length; i++){


            for(int n = commands[i][0]-1; n<=commands[i][1]-1; n++){
                list.add(array[n]);
                //System.out.println(array[n]);
            }

            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
            //System.out.println(answer[i]);
            list.clear();

        }

        return answer;
    }
}
