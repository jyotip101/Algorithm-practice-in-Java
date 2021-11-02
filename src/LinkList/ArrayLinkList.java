package LinkList;

import java.util.StringJoiner;

public class ArrayLinkList {
	    private Node head;
	 
	    public boolean isEmpty() {
	        return (head == null);
	    }
 
	    // used to insert a node at the start of linked list
	    public void insertFirst(int data) {
	        Node newNode = new Node();
	        newNode.data = data;
	        newNode.next = head;
	        head = newNode;
	    }
	 // For printing Linked List
	    public void printLinkedList() {
	        System.out.println("Printing LinkedList (head --> last) ");
	        Node current = head;
	        while (current != null) {
	            current.displayNodeData();
	            current = current.next;
	        }
	        System.out.println();
	    }
	    
	    public int getNth(int index) {
	    	Node c = head;
	    	for(int i = 0; i< index; ++i) {
	    		c = c.next;
	    	}
	    	return c.data;
	    }
	    
	public static void main(String[] args) { 
		ArrayLinkList list = new ArrayLinkList();
		
		for(int i=1; i<=5; i++) {
			list.insertFirst(i);
		}
		  
//		Node node = new Node();
//		node.data = 1;
//		list. 
		list.printLinkedList(); 
		System.out.print(list.getNth(0));
	}

}

class Node {
    public int data;
    public Node next;
 
    public void displayNodeData() {
        System.out.println(data);
    }
} 
