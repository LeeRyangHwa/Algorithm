package Programmers;

public class Programmers_문자열내p_y개수 {

    boolean solution(String s) {
        boolean answer = true;
        char[] s_array = s.toCharArray();

        int pcount = 0;
        int ycount = 0;

        for (char x : s_array) {
            if ('p' == x || 'P' == x) {
                pcount++;
            } else if ('y' == x || 'Y' == x) {
                ycount++;
            }
        }


        return pcount == ycount ? true : false;
    }
}

