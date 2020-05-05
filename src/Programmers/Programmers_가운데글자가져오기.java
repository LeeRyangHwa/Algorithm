package Programmers;

public class Programmers_가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        int center = size/2;

        if(size%2!=0){
            answer += s.charAt(center);
        }else{
            answer += s.charAt(center-1);
            answer += s.charAt(center);
        }

        return answer;
    }
}
