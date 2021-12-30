package com.jed.lemu.java8;

public class Revarr {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};

      int size  = arr.length;

      revarr(arr, 0 , size-1);

      for (int i = 0 ; i < size ; i++){
          System.out.println(arr[i]);
      }

    }
    static void  revarr(int arr[], int start , int end){

        int temp;
        while ( start  < end){

            temp = arr[start];
            arr[start] = arr[end] ;
            arr[end] = temp;
            start++;
            end--;


        }
    }
}
