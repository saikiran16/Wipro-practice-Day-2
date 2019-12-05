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
public class Max_Min_in_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max,min,i,n;
        System.out.println("Enter Size of array");
        n = input.nextInt();
        int arr[] = new int[n];
        for(i=0;i<arr.length;i++)
            arr[i] = input.nextInt();
        max = min = arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Maximum Value in array :" + max );
        System.out.println("Minimum Value in array :" + min );
            
    }
    
}
