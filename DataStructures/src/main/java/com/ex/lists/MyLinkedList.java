package com.ex.lists;

public class MyLinkedList {
	/*
	 * A LinkedList is an ordered set of data elements, such that 
	 * each element contains a link to its successor. When using a
	 * LinkedList object, we only have access to the head(first) 
	 * element, and the tail(last) element points to null.
	 * 
	 */
	
	private Node head;
	
	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		
		while(current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}
		
		result += "}";
		return result;
	}
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	public Node deleteNode(Node head, int d) {
		Node prev = head;
		Node next = head.getNextNode();
		while(next!=null) {
			if(next.getData()==d) {
				prev.setNextNode(next.getNextNode());
				return next;
			}
			else {
				prev = next;
				next = next.getNextNode();
			}
		}
		return null;
	}

}
