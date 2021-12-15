/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Amal
 */
public class NewClass {

    
        public static void main(String[] args) 
    { 
    int index ;
    Scanner input = new Scanner(System.in);
    System.out.println(" Input how many number : ");
    index = input.nextInt();
    System.out.println("0  1");
    fib(0, 1, index , 2);
    
}
   
     public static void fib(int n1 , int n2 , int index, int count ) 
    { 
        int newnum;
    if(count <= index)
    {
        newnum = n1 + n2;
        System.out.println( newnum + "  ");
        fib(n2, newnum, index, count + 1);
    }
}
}
    

