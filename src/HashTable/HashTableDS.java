
package HashTable;

public class HashTableDS<T> {
    Entry[] hasharray;
    int size;
   
    public HashTableDS(int size){
        this.size = size;
        hasharray=new Entry[this.size];
        //to initialize every element in linkedlist.
        for(int i=0;i<hasharray.length;i++){
            hasharray[i]=new Entry<T>();
      }
    }
      int GetHash(int key){
        return key%size; 
        }
      
      
    void put(int key,T value){
      int index = GetHash(key);
      Entry arrayvalue = hasharray[index];
      Entry newItem = new Entry(key,value);
      newItem.next = arrayvalue.next;
      arrayvalue.next = newItem;
         }
    
    public T get(int key){
        T value = null;
        int index = GetHash(key);
        Entry arrayvalue = hasharray[index];
        while(arrayvalue!=null){
            if(arrayvalue.getKey()==key){
                value = (T)arrayvalue.getValue();
                break;
            }
            arrayvalue=arrayvalue.next;
        }
        return value;
         }
    
}
