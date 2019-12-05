
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
public class Sum_Excluding6and7 {

   
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = input.nextInt(),i,j,sum = 0,sumBetween6and7 = 0,flag = 0;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = input.nextInt();
        for(i = 0 ; i < n ; i++)
        {
            sum = sum + arr[i];
            if(arr[i] == 6)
            {
              flag = 1;
              sumBetween6and7 = sumBetween6and7 + arr[i];
            }
            if(arr[i] == 7 && flag == 1)
            {
                
            }
        }
    }
    
}
