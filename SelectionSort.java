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
public class SelectionSort {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = input.nextInt(),i,j,pos,min;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = input.nextInt();
        for(i=0;i<n;i++)
        {
            pos = i;
            min = arr[i];
            for(j=i+1;j<n;j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    pos = j;
                }
            }
            if(i!=pos)
            {
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("Sorted Order :");
        for(i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
