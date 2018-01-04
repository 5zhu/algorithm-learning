package com.algorithdemo.list;

class DNode{
	
	private int value;
	
	private DNode last;
	
	private DNode next;
	
	public DNode(int data){
		this.value = data;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DNode getLast() {
		return last;
	}

	public void setLast(DNode last) {
		this.last = last;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}
	
	
}

/**
 * 双向链表操作类
 * @author gegf
 *
 */
public class DoubleLinkedList {
	
	/**
	 * 反转
	 * @param head
	 * @return
	 */
	public static DNode reverse(DNode head){
		DNode pre = null;
		DNode next = null;
		while(head!=null){
			next = head.getNext();
			head.setNext(pre);
			head.setLast(next);
			pre = head;
			head = next;
		}
		return pre;
	}

}
