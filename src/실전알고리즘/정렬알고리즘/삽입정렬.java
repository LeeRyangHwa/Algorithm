package 실전알고리즘.정렬알고리즘;

public class 삽입정렬 {
    public static void main(String[] args) {
        int temp,j;
        int[] array = {1,10,5,8,7,6,4,3,2,9};

        for(int i=0; i<array.length-1;i++){
            j = i;
            while(array[j]>array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }
        }

        for(int x:array){
            System.out.print(x+ " ");
        }
    }
}
