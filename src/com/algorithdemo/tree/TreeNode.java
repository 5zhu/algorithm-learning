package com.algorithdemo.tree;

/**
 * 二叉树 类
 */
public class TreeNode {
	
	/**当前节点的值*/
	private int value;
	/**左子树*/
	private TreeNode left;
	/**右子树*/
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
	
}
