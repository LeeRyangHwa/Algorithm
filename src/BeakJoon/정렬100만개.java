package BeakJoon;

public class 정렬100만개 {
    public static void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];

        while(left <= right){//엇갈릴때까지 반복
            //0  9
            //1  8
            //2  7
            //3  6
            //4  5
            //5  6  (엇갈린상황)
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }

        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }

    public static void main(String[] args) {

        int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};


        sort(data, 0, data.length - 1);
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
