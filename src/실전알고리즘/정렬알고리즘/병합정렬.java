package 실전알고리즘.정렬알고리즘;

public class 병합정렬 {
    static int[] sorted = new int[8];

    public static void main(String[] args) {
        int number = 8;
        int[] array = {7,6,5,8,3,5,9,1};
//        mergeSort(array, 0, number-1);
        mergeSort(array);
        for(int i = 0; i<number; i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }

        while (l < mid) {
            temp[t++] = arr[l++];
        }

        while (h < high) {
            temp[t++] = arr[h++];
        }

        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
    }
//    static void merge(int a[], int low, int mid, int high){
//        int[] temp  = new int[high - low];
//        int t =0, l = low, h = mid;
//
//        while(l < mid && h < high) {
//            if(a[l]<a[h]) {
//                temp[t++] = a[l++];
//            }else {
//                temp[t++]= a[h++];
//            }
//        }
//        while (l < mid) {
//            temp[t++] = a[l++];
//        }
//
//        while (h < high) {
//            temp[t++] = a[h++];
//        }
//
//        for (int i = low; i < high; i++) {
//            a[i] = temp[i - low];
//        }
//    }
//    static void mergeSort(int a[], int low, int high){
//        if(high - low <2) {
//            return;
//        }
//        int middle = (low+ high)/2;
//        mergeSort(a, 0, middle);
//        mergeSort(a, middle, high);
//        merge(a, low, middle, high);
//    }
}

