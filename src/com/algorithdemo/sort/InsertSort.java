package com.algorithdemo.sort;

public class InsertSort {
    
    public static void main(String[] args) {
        int a[]={12,3,45,23,43,31,64,22,1,4,7};
        insertSort(a);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);   
    }
    
    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

}
