package algorithams;

public class BinarySearchRecursive {

	public void binarySearchRecur(
			int arr[], int loest, int high, int key) { 
		 
		
		if(loest == high) {
			if(arr[loest] == key) {
				System.out.print("Element found at fist index");
			}else {
				System.out.print("Element is not found.");
			}
		}else {
			int mid = (loest + high) / 2;
			if(key == arr[mid]) {
				System.out.print("Element " + key + " found at array of  " + (mid + 1) + " index.");
			}else if(key < arr[mid]){
				binarySearchRecur( arr, loest, mid - 1, key);
			}else {
				binarySearchRecur(arr, mid + 1, high, key);
			}
		}
	}

	public static void main(String[] args) { 
		
		int array[] = {2, 5, 7, 9, 12, 34, 45, 56, 67, 88};
		int key = 12;
		int loest = 0;
		int high = array.length - 1;
		new BinarySearchRecursive().binarySearchRecur(array, loest , high,  key);
	}

}
