/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;


public class HashClassDemo {
    public static void main(String[] args) {
        
    
    HashTableDS<String> hashdemo = new HashTableDS<String>(10);
    hashdemo.put(2,"Amal");
    hashdemo.put(5,"Maha");
    hashdemo.put(6,"Hala");
    hashdemo.put(3,"Nahel");
    System.out.println(hashdemo.get(10));
       
    
    }
}
