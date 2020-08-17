package 실전알고리즘.정렬알고리즘;

public class 계수정렬 {
    public static void main(String[] args) {
        //int[] array = {1,3,2,4,3,2,5,3,1,2,3,4,4,3,5,1,2,3,5,2,3,1,4,3,5,1,2,1,1,1};

        int[] array = {1,10,5,8,7,6,4,3,2,9};
        int[] count = new int[array.length];

        for (int i=0; i<count.length; i++){
            count[i] = 0;
        }
        for(int i=0; i<array.length; i++){
            count[array[i] - 1]++;
        }

        for(int i=0; i<count.length; i++)
        {
            if(count[i]!=0){
                for(int j = 0; j<count[i];j++){
                    System.out.print(i+1+" ");
                }
            }
        }
    }
}
