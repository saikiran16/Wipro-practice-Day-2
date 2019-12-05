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
public class Highest_RepeatedNUmber_inArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = input.nextInt(),i,j,most=0,count,pos = 0;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = input.nextInt();
        for(i=0;i<n;i++)
        {
            count = 1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            if(most < count){
                most = count;
                pos = i;
            }
        }
        System.out.println("Most Repated Number is : " +arr[pos]);
    }
    
}
