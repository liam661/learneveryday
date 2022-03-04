package liam.year22.design.strategy;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 16:47
 **/
public class Sort<T> {
    public  void sort(T [] arr, Comparator<T> comparator){
        int minPos;
        for(int i = 0; i < arr.length - 1; i++){
            minPos = i;
            for(int j = i + 1; j < arr.length - 1; j++){
                minPos = comparator.compareTo(arr[j], arr[j+1]) == -1  ? j : minPos;
            }
            if(i != minPos){
                swap(arr, i, minPos);
            }
        }
    }

    void swap(T [] arr, int m, int n){
        T tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
}
