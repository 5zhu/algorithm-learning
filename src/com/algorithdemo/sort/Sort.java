package com.algorithdemo.sort;

public class Sort {
    
    public static void main(String[] args) {
        int a[]={12,3,45,23,43,31,64,22,1,4,7};
        bubbleSort2(a);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);   
    }
    
    /**
     * ð������
     * @param a
     */
    public static void bubbleSort(int a[]){
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }
        }
        }
    
    /**
     * ð������Ľ�
     * @param a
     */
    public static void bubbleSort2(int[] arr){
        boolean flag = true;
            int temp;//����һ����ʱ����
            for(int i=1;i<arr.length&&flag;i++){//ð��������n-1��
                flag = false;
                for(int j=0;j<arr.length-i;j++){
                    if(arr[j+1]<arr[j]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    }
                }
            }
      }
    
    }
