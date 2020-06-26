package Programmers;

public class Programmers_멀쩡한사각형 {
    public long solution(int w, int h) {
        long answer = 1;
        long w1 = Long.parseLong(String.valueOf(w));
        long h1 = Long.parseLong(String.valueOf(h));

        long gcd = gcd(w1, h1);
        System.out.println(gcd);
        long color = ((w1/gcd)+(h1/gcd)-1)*gcd;

        answer = w1*h1 - color;
        return answer;
    }
    public long gcd(long x, long y){
        long big = 0;
        if(x<y){
            long tmp = x;
            x=y;
            y=tmp;
        }
        long r=1;
        while(r >0){
            r = x % y;
            x = y;
            y = r;
        }

        return x;
    }
}
