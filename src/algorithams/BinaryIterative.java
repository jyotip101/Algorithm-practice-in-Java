package algorithams;

public class BinaryIterative {
	
	public void binarySearchItert(int arr[], int key, int first, int last) {
		
//		using while loop
		int midValue = (first + last) / 2; 
		while(first <= last) {
			
			if(key == arr[midValue]) {
				System.out.println("Element " + key + " found index at " + (midValue + 1) );
				break;
			}else if(key < arr[midValue]) {
				last = midValue - 1;
			}else {
				first = midValue + 1;
			}
			
			midValue = (first + last) / 2;
		}
		
//		using for loop
		for(
			int mid = (first+last)/2; 
				first <= last; 
					mid = (first+last)/2
						) {
			
			if(key == arr[mid]) {
				System.out.print("Element " + key + " found index at " + (mid + 1));
				break;
			}else if(key < arr[mid]) {
				last = mid - 1;
			}else {
				first = mid + 1;
			}
		}
 
	}
	
	public static void main(String[] args) {
		 
		int numbers[] = {2, 4, 6, 7, 8, 12, 14, 19, 34, 99};
 
		int key = 7;
		int last = numbers.length - 1; 
		new BinaryIterative().binarySearchItert(numbers, key, 0, last);
  
	}

}
