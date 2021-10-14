package algorithams;

public class BinerySearch {
	
	public static void binarySearch(int arr[], int key, int first, int last) {
		
		int midValue = (first + last) / 2;
		 
		
		while(first <= last) {
			
			if(key == arr[midValue]) {
				System.out.print("Element " + key + " found index at " + midValue);
				break;
			}else if(key < arr[midValue]) {
				last = midValue - 1;
			}else {
				first = midValue + 1;
			}
			
			midValue = (first + last) / 2;
		}
 
	}
	
	public static void main(String[] args) {
		 
		int numbers[] = {2, 4, 6, 7, 8, 12, 14, 19, 34, 99};
 
		int key = 99;
		int last = numbers.length - 1;
		
		binarySearch(numbers, key, 0, last);
  
	}


}
