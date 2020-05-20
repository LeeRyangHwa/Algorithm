package 실전알고리즘.정렬알고리즘;

public class 퀵정렬 {
    public static void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];

        while(left <= right){//엇갈릴때까지 반복
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

//    static int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
////    static int number=array.length-1;
//
//    public static void main(String[] args) {
//        int number = array.length;
//        quickSort(array, 0, number - 1);
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public static void quickSort(int[] data, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//        int key = start; // 첫번째 요소
//        int i = start + 1; //왼쪽 출발 지점
//        int j = end;  //오른쪽 출발 지점
//        int temp;
//
//        while (i <= j) {// 엇갈릴때까지 반복
//            while (data[i] <= data[key]) { //키 값보다 큰 값을 만날때까지 반복
//                i++;
//            }
//            while (data[j] >= data[key] && j > start) {  //키 값보다 작은 값을 만날때 까지 반복
//                j--;
//            }
//            if (i > j) {
//                temp = data[j];
//                data[j] = data[key];
//                data[key] = temp;
//            } else {
//                temp = data[j];
//                data[j] = data[i];
//                data[i] = temp;
//            }
//        }
//        if (start < j) quickSort(data, j + 1, end);
//        if (end > i) quickSort(data, start, j - 1);
//    }
}

