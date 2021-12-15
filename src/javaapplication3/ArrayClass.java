
package javaapplication3;

public class ArrayClass {
    public static void main(String[] args) {
        int[] prices = new int[4];
        prices[0]=100;
        prices[1]=200;
        prices[2]=400;
        prices[3]=13;
        System.out.println(prices[2]);
        
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]==400){
                System.out.println("found");
            }else{
               System.out.println(prices[i]);
           }
        }
        }
    }

