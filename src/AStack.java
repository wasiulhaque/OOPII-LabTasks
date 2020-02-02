import java.util.Stack;

public class AStack {
    private boolean isMin;

    AStack(boolean isMin) {
        this.isMin = isMin;
    }

    Stack<Integer> s = new Stack<>();
    private Stack<Integer> newStack = new Stack<>();

    void push(int n) {
        s.push(n);
        if (isMin) {
            if (newStack.isEmpty())
                newStack.push(n);
            else if (newStack.peek() > n)
                newStack.push(n);
        } else {
            if (newStack.isEmpty())
                newStack.push(n);
            else if (newStack.peek() < n)
                newStack.push(n);
        }
    }

    int pop() {
        if (s.isEmpty())
            return 0;
        int n = s.pop();
        if (newStack.peek() == n)
            newStack.pop();
        return n;
    }

    int minOrMax() {
        return (newStack.peek());
    }
}
