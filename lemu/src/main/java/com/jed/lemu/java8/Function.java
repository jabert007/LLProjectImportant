package com.jed.lemu.java8;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.data.relational.core.sql.In;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


class Student{

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Function {

    public static void main(String[] args) {

        //Function has to square of the interger
        java.util.function.Function<Integer,Integer> fi = i -> i * i ;
        System.out.println("function value : " +fi.apply(5));

        java.util.function.Function<String,Integer> fi2 = s -> s.length();
        System.out.println(fi2.apply("jedrick gnana lemuvel"));


        /* Function to check the grad */
        java.util.function.Function<Student,String> gr= student -> {
            int marks = student.marks;
            String grade = "";
            if(marks > 80) grade = "A";
            else if ( marks > 60 ) grade = "B";
            else if (marks > 50) grade = "C";
            else  grade = "E" ;
            return grade;
        };


        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;

        int n = 3;

        List<Integer> lst =  new ArrayList<Integer>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length; i++) {
            lst.add(arr[i]);
        }
        System.out.println(lst.toString());


        System.out.println(lst.toString());




        Student student = new Student("jedrick",70);

        System.out.println("mark of student : "+gr.apply(student));

        ConcurrentHashMap<Map<Integer,Integer>,Integer> map = new ConcurrentHashMap<>();



        TreeSet<Object> ints = new TreeSet<Object>();
        ints.add(2);
        ints.add(20);
        ints.add(10);
        ints.add(5);https://clari5.atlassian.net/browse/BOI-1760
        ints.add(7);
        ints.add(3);




        TreeSet<Object> intsReverse =
                (TreeSet<Object>)ints.descendingSet();

        // Print the set
        System.out.println("Without descendingSet(): " +
                ints);
        System.out.println("With descendingSet(): " +
                intsReverse);


        java.util.function.Function<String,String> func = s -> s.substring(1,20);

        System.out.println(func.apply("am learning java i have written function"));


    }
}
