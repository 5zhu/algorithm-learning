package com.algorithdemo.tree;

import java.util.Stack;

public class Node {
	
	public int value;
	public Node left;
	public Node right;
	
	public Node(int data){
		this.value = data;
	}
	
	/**
	 * 递归 前序遍历
	 * @param head
	 */
	public void preOrderRecur(Node head){
		if(head==null){
			return;
		}
		System.out.print(head.value+" ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	
	/**
	 * 中序遍历 
	 * @param head
	 */
	public void inOrderRecur(Node head){
		if(head==null){
			return;
		}
		inOrderRecur(head.left);
		System.out.print(head.value+" ");
		inOrderRecur(head.right);
	}

	public void posOrderRecur(Node head){
		if(head == null){
			return;
		}
		posOrderRecur(head.left);
		posOrderRecur(head.right);
		System.out.print(head.value + " ");
	}
	
	public static void main(String[] args) {
		Node tree = new Node(1);
		Node lt = new Node(2);
		Node rt = new Node(3);
		tree.left=lt;
		tree.right=rt;
//		tree.inOrderRecur(tree);
//		tree.preOrderRecur(tree);
		tree.inOrderUnRecur(tree);
	}
	
	/**
	 * 前序遍历 非递归
	 * @param head
	 */
	public void preOrderUnRecur(Node head){
		System.out.println("pre-order");
		if(head!=null){
			Stack<Node> stack = new Stack<Node>();
			stack.add(head);
			while(!stack.isEmpty()){
				head = stack.pop();
				System.out.print(head.value+" ");
				if(head.right != null){
					stack.push(head.right);
				}
				if(head.left != null){
					stack.push(head.left);
				}
			}
		}
	}
	
	
	public void inOrderUnRecur(Node head){
		System.out.println("in-order :");
		if(head != null){
		  Stack<Node> stack = new Stack<Node>();
		  while(!stack.isEmpty() || head!=null ){
			  if(head!=null){
				  stack.push(head);
				  head = head.left;
			  }else{
				  head = stack.pop();
				  System.out.print(head.value+" ");
				  head = head.right;
			  }
		  }
		}
	}
	
	public void posOrderUnRecur(Node head){
		System.out.println("pos-order:");
		if(head!=null){
			Stack<Node> stack = new Stack<Node>();
			stack.push(head);
			Node c = null;
			while(!stack.isEmpty()){
				c= stack.peek();
				if(c.left!=null && head!=c.left && head!=c.right){
					stack.push(c.left);
				}else if(c.right!=null && head!=c.right){
					stack.push(c.right);
				}else{
					System.out.print(stack.pop().value+" ");
					head = c;
				}
				 
			}
		}
	}
}
