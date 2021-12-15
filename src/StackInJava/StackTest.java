
package StackInJava;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top);
    }
    
}
