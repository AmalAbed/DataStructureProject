/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Amal
 */
public class RecursionPackage {
    // Java code to implement Fibonacci series

// Function for fibonacci
static int fib(int n)
{
    // Stop condition
    if (n == 0)
        return 0;
 
    // Stop condition
    if (n == 1 || n == 2)
        return 1;
 
    // Recursion function
    else
        return (fib(n - 1) + fib(n - 2));
}
 
// Driver Code
//public static void main(String []args)
//{
//   
//    // Initialize variable n.
//    int n = 5;
//    System.out.print("Fibonacci series of 5 numbers is: ");
// 
//    // for loop to print the fibonacci series.
//    for (int i = 0; i < n; i++)
//    {
//        System.out.print(fib(i)+" ");
//     }
//   }

}
