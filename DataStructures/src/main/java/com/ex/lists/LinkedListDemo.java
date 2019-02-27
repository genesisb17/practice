package com.ex.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insertAtHead(6);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(15);
		System.out.println(list);
		
		List<Integer> linked = new LinkedList<Integer>();
		linked.add(6);
		linked.add(10);
		linked.add(20);
		linked.remove(new Integer(10));
		System.out.println(linked);
	}

}
