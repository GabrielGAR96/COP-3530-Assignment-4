
public class MyBinaryHeap {
	
	int size;
	int currSize;
	
	long key;
	long[] elements;
	KeyVal[] keyValue;
	
	public MyBinaryHeap(int size)
	{
		this.size = size;
		currSize = 0;
		elements = new long[size];
		keyValue = new KeyVal[size];
	}
	
	void insert(KeyVal kv)
	{
		if(isFull()) return;
		
		int index = 0;
		while(elements[index] != 0)
		{
			index++;
		}
		
			keyValue[index] = kv;
			
			while(index > 0) {

			int parentIndex = (index-1)/2;
			
			if(keyValue[index].getKey() <= keyValue[parentIndex].getKey())
			{
				KeyVal aux = keyValue[parentIndex];
				keyValue[parentIndex] = keyValue[index];
				keyValue[index] = aux;
			} else {
				return;
			}
			index = parentIndex;
		}
		currSize++;
		
	}
	
	
	void insert(long element)
	{
		if(isFull()) return;
		
		int index = 0;
		while(elements[index] != 0)
		{
			index++;
		}
		
			elements[index] = element;
			
			while(index > 0) {

			int parentIndex = (index-1)/2;
			
			if(elements[index] <= elements[parentIndex])
			{
				long aux = elements[parentIndex];
				elements[parentIndex] = elements[index];
				elements[index] = aux;
				
				
			} else {
				return;
			}
			index = parentIndex;
		}
//			size++;
		
		
	}
	
	KeyVal deleteMin()
	{
//		int currSize = size;
		
//		if(!isFull()) {
//			for (int i = 0; i < size; i++) {
//				if(elements[i] == 0) currSize = i+1;
//			}
//		}
		
		
		KeyVal temp = keyValue[0];
		
		elements[0] = elements[currSize-1];
		elements[currSize-1] = 0;
		
		keyValue[0] = keyValue[currSize-1];
		keyValue[currSize-1] = null;
	
		currSize--;
//		size--;
		
		int nodeIndex = 0;
		long value = elements[0]; 
		
		int childIndex = 2 * nodeIndex + 1;
		long minValue;
		int minIndex;
		
		
		while(childIndex < currSize)
		{
			minValue = value;
			minIndex = -1;
			for (int i = 0; i < 2 && i + childIndex < currSize; i++) {
				if(keyValue[i+childIndex].getKey() < minValue)
				{
					minValue = keyValue[i+childIndex].getKey();
					minIndex = i+childIndex;
					
				}
			}
			
			if(minValue == value) {
				
				return temp;
				}
			else
			{
				long aux = elements[nodeIndex];
				elements[nodeIndex] = elements[minIndex];
				elements[minIndex] = aux;
				
				KeyVal auxKey = keyValue[nodeIndex];
				keyValue[nodeIndex] = keyValue[minIndex];
				keyValue[minIndex] = auxKey;
				
				nodeIndex = minIndex;
				childIndex = 2 * nodeIndex + 1;
			}
		}
		return temp;
	}
	
	
	
	boolean isFull()
	{
		for (int i = 0; i < elements.length; i++) {
			if(elements[i] == 0) return false;
		}
		return true;
	}

	
}
