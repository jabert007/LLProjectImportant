package com.jed.lemu.java8;

import org.apache.kafka.common.protocol.types.Field;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

        System.out.println(localDateTime.format(formatter));

        String datetime1 = "13-10-2021 19:11:25.394" ;
        String datetime2 = "14-10-2021 19:11:25.394" ;

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        Date date1 = null;
        Date date2 = null;

        try {
            date1 = df.parse(datetime1);
            date2 = df.parse(datetime2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long epoch1 = date1.getTime();
        long epoch2 = date2.getTime();
        System.out.println(epoch1/60000);
        System.out.println(epoch2/60000);


        Date date = new Date(epoch2
                * 1000L);
        SimpleDateFormat jdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        String java_date = jdf.format(date);

        System.out.println(java_date);


        String formatIn = "yyyy-MM-dd HH:mm:ss.S";
        String formatOut = "dd-MM-yyyy HH:mm:ss.SSS";

        String valueIn = "2021-12-20 06:31:01.0";

        SimpleDateFormat in = new SimpleDateFormat(formatIn);
        SimpleDateFormat out = new SimpleDateFormat(formatOut);

        Date dateIn = null;
        try {
            dateIn = in.parse(valueIn);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("< " + dateIn);

        String valueOut = out.format(dateIn);
        System.out.println("> " + valueOut);


        System.out.println(getDateDiff(date1,date2,TimeUnit.MINUTES));



    }

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MINUTES);
    }
}
