class Stack {
    
    int currentSize = 0;
    int maxSize;
    int[] values;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        values = new int[maxSize];
    }

    boolean isFull() {
        return currentSize == maxSize;
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    int push(int value) {
        if (!isFull()) {
            values[currentSize] = value;
            currentSize++;
            return value;
        } else {
            throw new StackIsFullException("Stack is full. You cannot push any value.");
        }
    }

    int pop() {
        if (!isEmpty()) {
            int returnValue;
            returnValue = values[currentSize-1];
            values[currentSize-1] = 0;
            currentSize--;
            return returnValue;
        } else {
            throw new StackIsFullException("Stack is empty. You cannot pop any value.");
        }
    }

    int peek() {
        if (!isEmpty()) {
            int returnValue;
            returnValue = values[currentSize-1];
            return returnValue;
        } else {
            throw new StackIsFullException("Stack is empty. You cannot pop any value.");
        }
    }

    private String stackString() {
        String stack = "";

        for (int value:values) {
            if (value!=0) {
                stack += (value + " ");
            }
        }

        return stack;
    }

    @Override
    public String toString() {
        return "Our stack: " + stackString();
    }
}

