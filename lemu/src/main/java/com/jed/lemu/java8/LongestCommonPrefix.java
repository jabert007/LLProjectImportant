package com.jed.lemu.java8;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        String prefix = arr[0];
        int length = arr.length;
        for(int i = 1 ; i < length - 1 ; i++){
            prefix = commonprefix(prefix,arr[i]);
        }

    }

    static String commonprefix(String n1,String n2){

        return null;
    }
}
