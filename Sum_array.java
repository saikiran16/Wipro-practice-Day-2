/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supra;

/**
 *
 * @author Saikiran
 */
public class Sum_array {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = new int[]{1,2,3,4,5};
        for(int i = 0 ;i<arr.length;i++)
        sum = sum + arr[i];
        
        System.out.println(sum);
        
    }
    
}
