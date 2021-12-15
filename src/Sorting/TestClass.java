
package Sorting;


public class TestClass {
    public static void main(String[] args) {
        BubbleSortingClass bbc = new BubbleSortingClass(5);
        int[] array={2,6,1,4,3};
        bbc.sort(array);
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    
}
