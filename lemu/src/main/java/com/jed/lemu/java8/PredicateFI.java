package com.jed.lemu.java8;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFI  {

    public static void main(String[] args) {

        //Predicate program to check if i is even
       Predicate<Integer>  p1 = i -> i % 2 ==0;


                     

        System.out.println(p1.test(10));
        System.out.println(p1.negate().test(15));

        //Predicate to check if length of string is equal to  5
        Predicate<String> stpr = s -> s.length() == 5 ;
        System.out.println(stpr.test("value"));

        Set<String> set = new HashSet<>();
        set.add("value");
        Predicate<Set<String>> setPredicate = strings -> strings.size() > 0;
        System.out.println("check set : ["+setPredicate.test(set)+"]");


        System.out.println("set is : ["+set.stream().collect(Collectors.joining("','", "'", "'"))+"]");


        String string = String.join(",", set);
        System.out.println("string with comma :["+string+"]");



        //Predicate to check if string array has string length  greater than 5
        String[]  arr = {"helloworld","great", "jedrick", "gnana" , "lemuvel", "kuttymoni" ,"monishajabert", "bing" };
        Predicate<String> parrystr = s -> s.length() > 5;
        for(String s : arr){
            if(parrystr.test(s)){
                System.out.println(s);
            }
        }

        JSONObject jsonObject = new JSONObject();
        try {

            jsonObject.put("key1","value1");
            jsonObject.put("key2", "value2");
            jsonObject.put("key3", "value3");


        } catch (JSONException e) {
            e.printStackTrace();
        }

        Predicate<JSONObject> jsnpr = j -> j.has("key3");
        Predicate<JSONObject> jsnpr1 = j -> j.has("key4");
        System.out.println(jsnpr1.and(jsnpr).test(jsonObject));


    }



}
