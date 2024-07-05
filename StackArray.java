
public class StackArray {
	private final int MAX_SIZE;
	private Object[] stackArray;
	private int top;

	public StackArray(final int MAX_SIZE) {
		this.MAX_SIZE = MAX_SIZE;
		stackArray = new Object[MAX_SIZE];
		top = -1;
	}

	public void push(Object element) {
		if (top + 1 != MAX_SIZE) {
			stackArray[++top] = element;
		} else {
			System.out.println("Full");
		}
	}

	public Object pop() {
		if (!isEmpty()) {
			Object temp = stackArray[top--];
			return temp;
		}
		return null;
	}

	public Object peek() {
		if (isEmpty())
			return null;
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}

	public boolean isFull() {
		return (top + 1) == MAX_SIZE;
	}
}
