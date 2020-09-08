package 실전알고리즘.깊이우선탐색;
import java.util.*;

public class BfsGraph {
    static int number = 7;
//    static boolean c[7];
    static Vector<Integer> a = new Vector();

    void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
//        c[start] = true;
        while(!q.isEmpty()){
            int x= q.poll();
            System.out.println(x);
            for(int i=0; i<a.size(); i++){

            }
        }
    }

}
