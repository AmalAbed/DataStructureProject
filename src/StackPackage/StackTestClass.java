
package StackPackage;

public class StackTestClass {
    public static void main(String[] args) {
        StackClass stack = new StackClass(4);
        stack.push(2);
        stack.push(0);
        stack.push(0);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        
        
    }
}
