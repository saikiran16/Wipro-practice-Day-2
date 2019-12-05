/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supra;

import static java.lang.Integer.MIN_VALUE;
import java.util.Scanner;

/**
 *
 * @author Saikiran
 */
public class Remove_Duplicates_inArray {
    
       public static void main(String[] args) {
        
           Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = input.nextInt(),i,j;
        int arr[] = new int[n];
        for(i=0;i<n;i++)    
            arr[i] = input.nextInt();
        for(i = 0 ; i < n ; i++)
        {
            for(j =i+1 ; j < n ; j++)
            {
                if(arr[j] == arr[i])
                    arr[j] = MIN_VALUE;
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]!=MIN_VALUE)
                System.out.print(arr[i] + " ");
        }
           
           
    }
}
