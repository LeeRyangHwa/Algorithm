package Programmers;

import java.util.Arrays;

public class Programmers_문자열내마음대로정렬 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for(int i = 0; i<strings.length; i++){
            String tmp = strings[i].charAt(n)+strings[i];
            answer[i]=tmp;
        }
        Arrays.sort(answer);

        for(int i = 0 ; i < answer.length; i++) {
            answer[i] = answer[i].substring(1,answer[i].length());
        }
        return answer;
    }
}
