/**
 * 
 */
package LinkList;
 
/**
 * @author hp 
 *
 */
/** 
 * Node creation
 * **/
//class Node {
//     
//	int data;
//    Node next;
//}

public class SinglyLinkedList {
	
	int data;
	SinglyLinkedList next;
//	Head refer to front of list
//	private Node head;
//	
//	private int size;
//	/**
//	 * init the LinkList
//	 */
//	public SinglyLinkedList() { 
//		head = null;
//		size = 0;
//	}
//	/**
//	 * int the LinkList with specific size and head
//	 */
//	public SinglyLinkedList(Node head, int size) {
//		this.head = head;
//		this.size = size;
//	}
//	
//	/**
//	 * Insert a new node at a specified position of this list
//	 */
//	public void inserNth(int data, int position) {
//		checkBounds(position, 0 , size);
//		Node newNode = new Node(data); 
//		
//		if(head == null) {
//			head = newNode;
//			size++;
//			return;
//		}else if(position == 0) {
//			newNode.next = head;
//			head = newNode;
//			size++;
//			return;
//		}
//		
//		Node cur = head;
//		for
//	}
//	/**
//	 * check index out of bounds Exception if given 
//	 * position is not present in LinkList
//	 */
//	public void checkBounds(int position, int low, int high) {
//		if(position > high || position < low) {
//			throw new IndexOutOfBoundsException(position + "");
//		}
//	}
//	/**
//	 * check list is empty 
//	 */
//	public boolean isEmpty() {
//		return size == 0;
//	}
//	 
//	/**
//	 * 
//	 */
	public static void main(String[] args) { 
		SinglyLinkedList l1 = new SinglyLinkedList();
		l1.data = 7;
		l1.next = null;
		System.out.println("{ " + l1.data + " } ");
	}

}
