package 실전알고리즘.정렬알고리즘;

public class 버블정렬 {
    public static void main(String[] args) {
        int min,index=0, temp;
        int[] array = {1,10,5,8,7,6,4,3,2,9};

        for (int i=0; i<array.length; i++){
            for(int j=0; j<(array.length-1)-i; j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int data:array){
            System.out.print(data+" ");
        }
    }
}
