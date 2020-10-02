package Stack;
import java.util.Stack;

class Prede_stack
{   
	 static int count=1;
    static void stack_push(Stack<Integer> stack, int i)
    {
       
            System.out.println("Element in index "+ count+"--> "+stack.push(i));
        ++count;
    }
    
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop :");

           Integer y = (Integer) stack.pop();
            System.out.println(y);
            --count;
        
    }

    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }
    
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

    public static void main (String[] args)
    {
       Stack<Integer> stack=new Stack<Integer>();

        stack_push(stack, 10);
        stack_push(stack, 20);
        stack_push(stack, 30);
        
        stack_pop(stack);
        stack_push(stack, 30);
        stack_peek(stack); //it return top of the stack
        stack_push(stack, 40);
        stack_search(stack, 20);
        stack_search(stack, 6);
    }
}
