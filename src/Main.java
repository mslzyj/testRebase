import java.util.*;

/**
 * @autor zyj
 * @date 2020/11/8 19:14
 */
public class Main {

    private static int count;
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] num = {3,1,4,6,0,8,12};
        quickSort(num,0,num.length-1);
        for (int i : num) {
            System.out.print(i + " ");
        }

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int index = find(arr, 5);
        System.out.println("index:" + index );

    }

    /**
     * 快排序
     * @param arr
     * @param left
     * @param right
     */
    private static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int i = left;
        int j = right;
        int key = arr[left];
        while (i < j){
            while (i < j && arr[j] >= key) j--;
            arr[i] = arr[j];
            while (i < j && arr[i] <= key) i++;
            arr[j] = arr[i];
        }
        arr[i] = key;
        quickSort(arr,left,i - 1);
        quickSort(arr,i + 1,right);
    }

    /**
     * 二分查找
     * @return
     */
    public static int find(int [] arr,int num){
        int begin = 0;
        int end = arr.length -1;
        int mid = 0;
        while (begin <= end){
            mid = (begin + end) / 2;
            if(arr[mid] == num){
                return mid;
            }else if(arr[mid] >= num){
                end = mid;
            }else{
                mid = begin;
            }
        }
        return -1;
    }

}
