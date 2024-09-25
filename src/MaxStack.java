import java.util.Stack;

class MaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;
    private Stack<Integer> minStack;

    public MaxStack(){
        mainStack = new Stack<>();
        maxStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);

        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }


}
