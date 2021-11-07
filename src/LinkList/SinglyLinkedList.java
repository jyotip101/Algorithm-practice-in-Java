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
		Node newNode = new Node(value); 
		newNode.next = head;
		head = newNode;
		size++; 
	}

//	insert node at End of list 
	public void insertAtEnd(int value) { 
//		go to the give position
		Node cur = head;
		for(int i = 0; i <= size + 1; i++) {
			cur = cur.next;
		}
//		now insert at that position 
		Node newNode = new Node();
		newNode.next = cur.next;
		newNode.value = value;
		cur.next = newNode;
		
		size++;
	}
	
	public void inserNth(int data, int position) {
		
		Node newNode = new Node(data);
		
//		if list is empty
		if(head == null) {
			head = newNode;
			size++;
			return;
//		insert at head of list
		}else if(position == 0) {
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		
//		insert at given position
		Node cur = head;
		for(int i = 0; i < position - 1; i++) {
			cur = cur.next;
		}
		
		newNode.next = cur.next;
		cur.next = newNode;
		size++;
		
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
//	print the size of list 
	public int size() {
		return size;
	}
	public static void main(String[] args) { 
		SinglyLinkedList list = new SinglyLinkedList();

		System.out.println("insert at the front");
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1); 
		list.printLinkList(); 
		
		System.out.println("\n Insert at the end");		
		list.insertAtEnd(5);
		list.insertAtEnd(9);
		list.printLinkList();
		

		System.out.println("\n Insert at the given position");		
		list.inserNth(4, 0);
		list.printLinkList();
		
		System.out.println("\nsize of list " + list.size());
		
	}

class  Node {
//	value of node
	int value;
//	point to next node
	Node next;

	Node(){}

	Node(int value) {
		this(value, null);
	}
	
	Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}
} 
 