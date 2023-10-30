package com;

import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Roman Number");
        String roman=sc.next();
        int result = romanToInteger(roman);
        System.out.println(result);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
        	
            int current = getValue(s.charAt(i));
          
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;
          
            if (current >= next) {
                result += current;
            } 
            else {
                result += (next - current);
                i++;
            }
        }
        return result;
    }

    public static int getValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
