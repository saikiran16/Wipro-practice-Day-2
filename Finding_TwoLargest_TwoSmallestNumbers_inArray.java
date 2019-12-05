/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supra;

import java.util.Scanner;

/**
 *
 * @author Saikiran
 */
public class Finding_TwoLargest_TwoSmallestNumbers_inArray {
    
    public static void main(String[] args) {
        
        int firstLargest, secondLargest,firstSmallest,secondSmallest ,n ,i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of array");
        n = input.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = input.nextInt();
        firstLargest = firstSmallest  = arr[0];
        secondLargest = secondSmallest = -1;
        for( i = 0 ; i < arr.length ; i++)
        {
            if(firstLargest < arr[i] )
            {
                if(i!=0)
                secondLargest = firstLargest; 
                firstLargest = arr[i];
               
            }
            if(firstSmallest > arr[i] )
            {
                if(i!=0)
                secondSmallest = firstSmallest ;
                firstSmallest = arr[i];
            }
        }
//        for( i = 0 ; i < arr.length ; i++)
//        {
//            if(secondLargest < arr[i] && i!=0)
//            {
//                
//                secondLargest = arr[i];
//            }
//            if(secondSmallest > arr[i] && secondSmallest>=firstSmallest)
//            {
//                
//                secondSmallest = arr[i];
//            }
//        }
        System.out.println("First Largest Number : " + firstLargest);
        System.out.println("Second Largest Number : " + secondLargest);
        System.out.println("First Smallest Number : " + firstSmallest);
        System.out.println("Second Smallest Number : " + secondSmallest);
            
        
    }
    
}
