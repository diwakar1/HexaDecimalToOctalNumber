package com.company;

import java.util.Scanner;

public class Main {

    public static  int Hexa_To_Decimal(String s){
        String s1= "0123456789ABCDEF";
        s= s.toUpperCase();
        int value=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            int d= s1.indexOf(c);
            value= 16*value+d;
        }
        return value;
    }

    public static void main(String[] args) {
        int decimalNumber;
        String hexaNumber;
        int[] octlNumber= new int[40];
        int i=1;
        int j;
        Scanner input = new Scanner(System.in);
        System.out.println("enter hexa number: ");
        hexaNumber=input.nextLine();

        decimalNumber= Hexa_To_Decimal(hexaNumber);
        System.out.println("The equivalent decimal number is: "+ decimalNumber);

        while(decimalNumber!=0){
            octlNumber[i++]=decimalNumber%8;
            decimalNumber=decimalNumber/8;

        }
        System.out.print("The equivalent octalNumber is: ");
        for(j=i-1;j>0;j--){
            System.out.print(octlNumber[j]);
        }
        System.out.println("\n");


    }
}
