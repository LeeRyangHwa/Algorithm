package Programmers;
import java.util.*;

public class Programmers_같은숫자는싫어 {
    public int[] solution(int []arr) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int tmp = -1;
        for(int data: arr){
            if(tmp!=data){
                arrayList.add(data);
                tmp = data;
            }
        }

        int[] answer = new int[arrayList.size()];
        for(int i=0; i< answer.length; i++){
            answer[i] = arrayList.get(i);
        }


        return answer;
    }
}
