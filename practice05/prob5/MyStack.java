package prob5;

@SuppressWarnings("serial")
class MyStackException extends Exception {
	public MyStackException(String message) {
		super(message);
	}
}

public class MyStack {
	private int top;
	private int size;
	private String[] strArr;

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String[] getStrArr() {
		return strArr;
	}

	public void setStrArr(String[] strArr) {
		this.strArr = strArr;
	}

	public MyStack(int i) {
		this.setTop(0);
		this.setSize(i);
		this.strArr = new String[this.getSize()];
	}

	public void push(String string) throws MyStackException {
		if (this.isFull() == true)
			throw (new MyStackException("stack is full"));
		else {
			strArr[this.getTop()] = string;
			this.setTop(this.getTop() + 1);
		}
	}

	public boolean isFull() {
		if (this.getTop() == this.getSize())
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (this.getTop() == 0)
			return true;
		else
			return false;
	}

	public String pop() throws MyStackException {
		if (this.isEmpty() == true)
			throw (new MyStackException("stack is empty"));
		else {
			String result = this.getStrArr()[this.getTop() - 1];
			this.setTop(this.getTop() - 1);
			return result;
		}
	}
}