
package Sorting;

public class BubbleSortingClass {
    int[] array;
    int size;
    public BubbleSortingClass(int size){
        this.size = size;
        array=new int[size];    
    }
    public void sort(int[] array){
        int n = size;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j] = temp;        
                }
            }
        }
             
        
    }
    
    
}
