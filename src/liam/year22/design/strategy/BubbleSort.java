package liam.year22.design.strategy;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 17:17
 **/
public class BubbleSort {
    public static void sort(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void swap(int [] arr, int m, int n){
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
}
