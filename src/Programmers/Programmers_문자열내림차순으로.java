package Programmers;

import java.util.Arrays;

public class Programmers_문자열내림차순으로 {
    public String solution(String s) {
        String answer = "";

        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        answer = new StringBuilder(new String(sol)).reverse().toString();
        return answer;
    }
}
