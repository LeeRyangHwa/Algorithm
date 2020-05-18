package 실전알고리즘.정렬알고리즘;

public class 선택정렬 {
    public static void main(String[] args) {
        int min,index=0, temp;
        int[] array = {1,10,5,8,7,6,4,3,2,9};

        for(int i=0; i<array.length; i++){
            min = array[i];
            for(int j=i; j<array.length; j++){
                if(min>array[j]){
                    min = array[j];
                    index=j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for(int data:array){
            System.out.print(data+" ");
        }
    }
}
