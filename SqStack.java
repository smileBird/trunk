package test;

public class SqStack<T> {

	private T data[];
	private int maxSize;
	private int top;
	
	public SqStack(int maxSize){
		this.maxSize = maxSize;
		data = (T[]) new Object[maxSize];
		top = -1;
	}
	
	public boolean isNull(){
		boolean flag = this.top<=-1?true:false;
		return flag;
	}
	
	public boolean isFull(){
		boolean flag = this.top == this.maxSize-1?true:false;
		return flag;
	}
	
	public boolean push(T value){
		if(isFull()){
			return false;
		}else{
			data[++top] = value;
			return true;
		}
	}
	
	public T pop(){
		if(isNull()){
			return null;
		}else{
			T value = data[top];
			top--;
			return value;
		}
	}
}
