/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author Amal
 */
public class Entry<T> {
    int key;
    T value;
    Entry next;
    
    public Entry(int key,T value){
    //initialize the items.
    this.key = key;
    this.value = value;
    this.next = null;
    }
    public Entry(){
    this.next = null;
    }
    
    public int getKey(){
        return key;
    }
    public T getValue(){
        return value;
    }
    
}
