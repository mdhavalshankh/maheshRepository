import java.util.Arrays;

public class MyArrayList<T> {
	static int size = 0, capacity = 4;
	@SuppressWarnings("unchecked")
	T[] a = (T[]) new Object[capacity];
	
	void add(T t){
		
		if(size == capacity){
			increaseSize();
		}
		a[size] = t;
		size++;
	}
	
	void remove(T t){
		for(int i=0; i<a.length; i++){
			if(t == a[i]){
				for(int j=i; j<a.length-1; j++){
					a[j] = a[j+1];
				}
			}
		}
	}
	
	T getElement(int index){
		
		return a[index-1];
	}
	
	void update(int index, T t){
		a[index-1] = t;
	}

	private void increaseSize() {
		a = Arrays.copyOf(a, capacity*3/2);
	}

	@Override
	public String toString() {
		return "\nMyArrayList [a=" + Arrays.toString(a) + "]";
	}
	
	
}
