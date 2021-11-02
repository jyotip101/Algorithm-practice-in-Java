/**
 * 
 */
package LinkList;
 
public class SinglyLinkedList {
	SinglyLinkedList(){
		head = null;
	    size = 0;
	}
//	front node of Linklist
	private Node head; 
	
//	size of LisnlList
	private int size;
 
//	insert node at Front of list 
	public void insertAtFront(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = head;
		head = newNode;
	}

//	insert node at End of list 
	public void insertAtEnd(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null;
	}
	
	public void inserNth(int data, int position) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			head = newNode;
			size++;
			return;
		}else if(position == 0) {
			
		}
	}
//	print value of linklist
	public void printLinkList() {
		System.out.print("-->");
		Node cur = head;
		while(cur != null) {
			System.out.print(" " + cur.value + ",");
			cur = cur.next;
		}
	}
	public static void main(String[] args) { 
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1);
 
		list.printLinkList();
		
		list.insertAtEnd(4);

		list.printLinkList();
		
	}

class  Node {
//	value of node
	public int value;
//	point to next node
	public Node next;

	Node(){}

	public Node(int value) {
		this.value = value;
	}
}
} 