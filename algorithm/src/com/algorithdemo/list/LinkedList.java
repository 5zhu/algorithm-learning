package com.algorithdemo.list;
/**
 * 单链表节点
 * @author gegf
 *
 */
class Node {
	
	/**节点值*/
	public int value;
	/**下一个节点*/
	public Node next;
	
	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int value){
		this.value = value;
	}
}

/***
 * 链表的操作
 * @author gegf
 *
 */
public class LinkedList{

	/**
	 * 反转单项链表
	 * @param head
	 * @return
	 */
    public static Node reverse(Node head){
    	Node pre = null;
    	Node next = null;
    	while(head != null){
    		next = head.getNext();
    		head.setNext(pre);
    		pre = head;
    		head = next;
    	}
		return pre;
    }
    
    public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.setNext(n2);n2.setNext(n3);
		Node node = LinkedList.reverse(n1);
		System.out.println(node.value+" "+node.next.value+" " +node.next.next.value);
	}
}
