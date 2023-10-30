package com;
import java.util.*;
public class PangramCheck {


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your sentence");
        String sentence =sc.next();
        boolean isPangram = isPangram(sentence); 
        if(isPangram)
        {
        	System.out.println("The Input Is Pangram");
        }
        else
        {
        	System.out.println("Input Is Not Pangram");
        }
    }
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
