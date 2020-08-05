package com.accionlabs.core;

import java.util.Scanner;

public class CircularString {

	public static void main(String[] args) {
		System.out.println("Enter String  s ");
		Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1+ " "+str2);
        if(str1.length() != str2.length())
        {
            System.out.println("false");
            return;
        }

        if(str1.equals(str2))
        {
            System.out.println("true");
            return;
        }

        for(int i = 0; i<str1.length()-1; i++)
        {
            String temp = str1.substring(i+1)+str1.substring(0,i+1);
            System.out.println(temp);
            if(temp.equals(str2))
            {
                System.out.println("true");
                return;
            }
        }

        System.out.println("false");
        return;
	}

}
