package com.jed.lemu.java8;

public class Arrayrotate {

    /* Array rotation things to remember always for loop with number  of shifts , then write a method, put the first element on temporaray varaiable
     and then iterate to move the second element to first place until the  size - 1 then add the temp element to the last array
     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int d = 3; //d is the distance
        for(int i = 0 ; i < d ; i++){

            arrayrotate(arr,9);
        }

        for(int i =0 ;  i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

     static void arrayrotate(int[] arr , int size){
        int temp;
        temp = arr[0];
        for(int i = 0 ; i < size - 1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[size - 1] = temp;
    }
}