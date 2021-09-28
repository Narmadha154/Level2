package com.company.test;

import java.util.Scanner;

public class StringRotation {
    public static void rotate(char [] str,int len){
        char temp=str[0];
        for(int j=0;j<len-1;j++){
            str[j]=str[j+1];
        }
        str[len-1]=temp;
    }
    public static boolean checkRotation(String str1,int len1,String str2){
        char [] arr=str1.toCharArray();
        for(int i=0;i<len1-1;i++){
            rotate(arr,len1);
            String newStr=String.copyValueOf(arr);
            if(newStr.equals(str2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1:");
        String str1=sc.next();
        System.out.println("Enter the string2:");
        String str2=sc.next();
        int len1=str1.length();
        if(checkRotation(str1,len1,str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
