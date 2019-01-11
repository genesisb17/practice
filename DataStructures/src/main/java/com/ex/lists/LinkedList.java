package com.ex.lists;

public class LinkedList {
	
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

}
