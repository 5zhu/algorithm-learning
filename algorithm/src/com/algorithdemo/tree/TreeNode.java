package com.algorithdemo.tree;

import java.util.Stack;

public class TreeNode {
	
	/**��ǰ�ڵ��ֵ*/
	private int value;
	/**������*/
	private TreeNode left;
	/**������*/
	private TreeNode right;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode(int data){
		this.value = data;
	}
	
	/**
	 * �ݹ� ǰ�����
	 * @param head
	 */
	public static void preOrderRecur(TreeNode head){
		if(head==null){
			return;
		}
		System.out.print(head.value+" ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	
	/**
	 * �ݹ�������� 
	 * @param head
	 */
	public static void inOrderRecur(TreeNode head){
		if(head==null){
			return;
		}
		inOrderRecur(head.left);
		System.out.print(head.value+" ");
		inOrderRecur(head.right);
	}

	/***
	 * �ݹ� �������
	 * @param head
	 */
	public static void posOrderRecur(TreeNode head){
		if(head == null){
			return;
		}
		posOrderRecur(head.left);
		posOrderRecur(head.right);
		System.out.print(head.value + " ");
	}
	
	/**
	 * ǰ����� �ǵݹ�
	 * @param head
	 */
	public static void preOrderUnRecur(TreeNode head){
		System.out.println("pre-order");
		if(head!=null){
			Stack<TreeNode> stack = new Stack<TreeNode>();
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
	
	/**
	 * ������� �ǵݹ�
	 * @param head
	 */
	public static void inOrderUnRecur(TreeNode head){
		System.out.println("in-order :");
		if(head != null){
		  Stack<TreeNode> stack = new Stack<TreeNode>();
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
	
	/**
	 * ������� �ǵݹ�
	 * @param head
	 */
	public static void posOrderUnRecur(TreeNode head){
		System.out.println("pos-order:");
		if(head!=null){
			Stack<TreeNode> stack = new Stack<TreeNode>();
			stack.push(head);
			TreeNode c = null;
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
	
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		TreeNode lt = new TreeNode(2);
		TreeNode rt = new TreeNode(3);
		tree.left=lt;
		tree.right=rt;
 		inOrderRecur(tree);
 		preOrderRecur(tree);
		inOrderUnRecur(tree);
	}
}
