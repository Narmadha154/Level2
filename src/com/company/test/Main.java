package com.company.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        int [] newArr=new int[size1+size2];
        int k=0;
        for(int i=0;i<size1;i++){
            newArr[k++]=arr1[i];
        }
        for(int i=0;i<size2;i++){
            newArr[k++]=arr2[i];
        }
        for(int i=1;i<k;i++){
            for(int j=0;j<k-i;j++){
                if(newArr[j]>newArr[j+1]){
                    int temp=newArr[j];
                    newArr[j]=newArr[j+1];
                    newArr[j+1]=temp;
                }
            }
        }
        int size=size1+size2;
        int l=0;
        int[] mergeArr=new int[size];
        for(int i=0,j=size-1;i<=j;i++,j--){
            if(i<j) {
                mergeArr[l++] = newArr[i];
                mergeArr[l++] = newArr[j];
            }
            else if(i==j){
                mergeArr[l++] = newArr[i];
            }
        }
        System.out.println("after merge");
        for(int i=0;i<size;i++){
            System.out.println(mergeArr[i]);
        }
    }
}
