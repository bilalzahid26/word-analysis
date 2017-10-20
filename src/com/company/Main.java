package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {


        String csvFile = "/Users/BilalZahid/Desktop/Computer Science/GitHub/word-analysis/src/negative-words.csv";
        String csvFile1 = "/Users/BilalZahid/Desktop/Computer Science/GitHub/word-analysis/src/positive-words.csv";
        String[] negativeWord = new String[0];
        String[] positiveWord = new String[0];
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String str;

            List<String> list = new ArrayList<String>();
            while ((str = br.readLine()) != null) {
                list.add(str);
            }


            positiveWord = list.toArray(new String[0]);

            System.out.println(positiveWord[0]);


        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile1))) {

            String str;

            List<String> list = new ArrayList<String>();
            while ((str = br.readLine()) != null) {
                list.add(str);
            }


            negativeWord = list.toArray(new String[0]);

            System.out.println(negativeWord[0]);


        } catch (IOException e) {

            e.printStackTrace();
        }
        
        String hello = "agonising";
        for (int i = 0; i < positiveWord.length; i++) {


            if (hello.equals(positiveWord[i])) {

                System.out.println("Positive");
            }
        }
        for (int i = 0; i < negativeWord.length; i++) {
            if (hello.equals(negativeWord[i])) {
                System.out.println("Negative");
            }
        }
    }
}
