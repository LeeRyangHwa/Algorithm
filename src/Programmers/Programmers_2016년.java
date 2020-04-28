package Programmers;

public class Programmers_2016년 {
    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b) {
        String answer = "";
        int days = b;
        if(a>1){
            for(int i=1; i<a; i++){
                days += dayCount(i);
            }
        }
        answer = Dayof(days);

        return answer;
    }
    public static int dayCount(int a){
        if(a == 2){
            return 29;
        }else if(a%2 == 1 && a <8){
            return 31;
        }else if(a%2 ==0 && a>=8){
            return 31;
        }else{
            return 30;
        }
    }

    public static String Dayof(int a){
        String day = "";
        int days = a%7;

        if(days == 1){
            day = "FRI";
        }else if(days == 2){
            day = "SAT";
        }else if(days == 3){
            day = "SUN";
        }else if(days == 4){
            day = "MON";
        }else if(days == 5){
            day = "TUE";
        }else if(days == 6){
            day = "WED";
        }else if(days == 0){
            day = "THU";
        }

        return day;
    }
}
