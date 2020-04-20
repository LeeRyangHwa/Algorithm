package Algorithm;
import java.util.*;

public class Programmers_Camouflage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] q = {{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"}};
		int an = solution(q);
		
		System.out.println(an);
	} 
	public static int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String,Integer> clothCount = new HashMap();
        ArrayList<String> list = new ArrayList<>();
        
        int size = clothes.length;
        String tmpCloth="";                        
        
        for(int i=0; i<size; i++){
            tmpCloth = clothes[i][0];
            
            if(!clothCount.containsKey(clothes[i][1])){
                clothCount.put(clothes[i][1],1);
            }else{
                if(!list.contains(clothes[i][0])){
                    list.add(clothes[i][0]);
                    int tmp = clothCount.get(clothes[i][1]);
                    clothCount.put(clothes[i][1],tmp+1);
                }
            }
                      
        }
        
        int mul=1;
        for(String key : clothCount.keySet()){
            int value = clothCount.get(key);
            //System.out.println(key+" : "+value);
            
            mul *= value+1;
        }
        answer = mul-1;//아무것도 선택하지 않은 경우는 제외시키기위해 -1을 해줘야한다.
        
        return answer;
    }
}

