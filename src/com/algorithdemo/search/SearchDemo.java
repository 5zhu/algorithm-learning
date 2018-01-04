package com.algorithdemo.search;


public class SearchDemo {
    
    /**
     * ????????? O(log2N)__??2???
     * @param arr
     * @param key
     * @return
     */
    public static int binarySearch(int[] arr, int key){
         long start = System.currentTimeMillis();
         int low, high, mid;
         low = 0;
         high = arr.length - 1;
         while(low <= high){
             mid = (low + high) >>> 1;
             if(arr[mid] < key){
                 low = mid + 1;
             }else if(arr[mid] > key){
                 high = mid - 1;
             }else{
                 long end = System.currentTimeMillis();
                 System.out.println(end - start);
                 return mid;
             }
         }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,23,41,53,63};
        int i = SearchDemo.binarySearch(arr, 9);
        System.out.println(i);
    }

}
