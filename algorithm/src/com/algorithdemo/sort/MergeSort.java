package com.algorithdemo.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {3,5,7,2,6,1,3,8,4};
        mergeSort(array, 0, array.length - 1);
    
        for (int i : array) {
            System.out.println(i);
        }
    }
    
    /**
     * 归并排序 O(nlogn)
     * @param array
     * @param l
     * @param r
     */
    public static void mergeSort(int[] array, int l, int r){
        if(l == r){
            return;
        }
        int m = (l + r)/2;
        mergeSort(array, l, m);
        mergeSort(array, m+1, r);
        mergeArray(array, l, m, r);
    }
    /**
     * 合并数组
     * @param array
     * @param l
     * @param m
     * @param r
     */
    public static void mergeArray(int[] array, int l, int m, int r){
        
        int [] temp = new int[r - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0; //temp 下标
        while(i <= m && j <= r){
        if(array[i] < array[j]){
           temp[k++] = array[i++];
         }else{
            temp[k++] = array[j++];
         }
        }
        // 
        while(i <= m){
            temp[k++] = array[i++];
        }
        while(j <= r){
            temp[k++] = array[j++];
        }
        for (int x = 0, y = l; x < temp.length; x++, y++) {
            array[y] = temp[x];
        }
    }
}
