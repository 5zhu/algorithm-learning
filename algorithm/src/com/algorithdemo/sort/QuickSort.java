package com.algorithdemo.sort;
/**
 * 参考 http://www.jianshu.com/p/442399ef0cf7
 *     http://www.jianshu.com/p/2f111685a316#
 * @author Administrator
 *
 */
public class QuickSort {

    
    public static void main(String[] args) {
        int[] arr = {11,213,134,44,77,78,23,43};
      
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left >= right){
            return;
        }
        
        int pivot = arr[left];     //定义基准值为数组第一个数
        int i = left;
        int j = right;
        while(i < j){   
            while(pivot <= arr[j] && i < j){//从右往左 找比基数小的数
                j--;
            }
            while(pivot >= arr[i] && i < j){
                i++;
            }
            if(i < j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        
        arr[left] = arr[i];
        arr[i] = pivot;
        quickSort(arr, left, i-1);
        quickSort(arr, i+1, right);
    }
    
   
}
