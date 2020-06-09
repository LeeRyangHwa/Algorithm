package BeakJoon;

public class 세수정렬 {
    public static void main(String[] args) {
        int i, j, min, index=0, temp;
        int[] array = {3,2,1};

        for(i=0; i<3; i++)
        {
            min = 100001;
            for(j = i; j<3; j++){
                if(min > array[j]){
                    min=array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index]= temp;
        }
        for (int num : array){
            System.out.print(num + " ");
        }
    }
}
