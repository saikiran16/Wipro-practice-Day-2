package supra;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saikiran
 */
public class BinarySearch {
    
    int search(int obj[] ,int low ,int high, int n , int k)
    {
        while(low < high)
        {
           int mid = (low + high-1)/2;
           if(obj[mid] == k)
               return mid;
           else if(obj[mid] > k)
                   {
                       high = mid - 1;
                       System.out.println("next high " + high);
                   }
           else{
               low = mid + 1;
               System.out.println("next low  " + low);
           }
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,key,i;
        System.out.println("Enter Size of Array");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in to Array");
        for(i = 0 ;i < n ; i++)
            arr[i] =input.nextInt();
        System.out.println("Enter Key To search");
        key = input.nextInt();
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(arr,0,n-1,n,key));
    }
    
}
