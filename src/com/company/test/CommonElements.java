package com.company.test;

import java.util.Scanner;

public class CommonElements {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int size1=sc.nextInt();
        int [] arr1=new int[size1];
        System.out.println("enter the elements of array1");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array2:");
        int size2=sc.nextInt();
        int [] arr2=new int[size2];
        System.out.println("enter the elements of array2");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array3:");
        int size3=sc.nextInt();
        int [] arr3=new int[size3];
        System.out.println("enter the elements of array3:");
        for(int i=0;i<size3;i++){
            arr3[i]=sc.nextInt();
        }
        int [] newArr=new int[size2];
        int k=0;
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr1[i]==arr2[j]){
                    for(int l=0;l<size3;l++) {
                        if (arr1[i] == arr3[l]) {
                            newArr[k++] = arr1[i];
                        }
                    }
                }
            }
        }
       /* int l=0;
        for(int i=0;i<size3;i++){
            for(int j=0;j<k;j++){
                if(arr3[i]==newArr[j]){
                    newArr[l++]=arr3[i];
                }
            }
        }*/
        System.out.println("common elements");
        for(int i=0;i<k;i++){
            System.out.println(newArr[i]);
        }
    }
}
