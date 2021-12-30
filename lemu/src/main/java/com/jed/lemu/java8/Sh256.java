package com.jed.lemu.java8;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sh256 {

    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {

        // Get the current date and time
        LocalTime currentTime1 = LocalTime.now();
        System.out.println("----["+currentTime1+"]");
        String time = currentTime1.toString().split("\\.")[0];
        System.out.println("timestamp " +time);

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("dateStamp : " + date1);

        String password = "Pas$w0RdO12a3";

        try {
            System.out.println("passw: ["+toHexString(getSHA(date1+password+time)) +"]");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


    }
}
