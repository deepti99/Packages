import java.util.Stack;

class StackDemo3 {
    public static void main(String[] args) {
        Stack<String> stackelements= new Stack<>();

        // Add elements to Stack
        stackelements.push("A");
        stackelements.push("B");
        stackelements.push("C");
        stackelements.push("D");
        stackelements.push("E");
        stackelements.push("F");
        System.out.println("Stack: " + stackelements);

        // Search an element
        int position = stackelements.search("A");
        System.out.println("Position of A: " + position);
        
        boolean result = stackelements.empty();
        System.out.println("Is the stack empty? " + result);
        
        
    }
}



