package com.algorithdemo.tree;

import java.util.Stack;

public class TreePrint {
	
	/**
	 * 递归 前序遍历
	 * @param head
	 */
	public static void preOrderRecur(TreeNode head){
		if(head==null){
			return;
		}
		System.out.print(head.getValue()+" ");
		preOrderRecur(head.getLeft());
		preOrderRecur(head.getRight());
	}
	
	/**
	 * 递归中序遍历 
	 * @param head
	 */
	public static void inOrderRecur(TreeNode head){
		if(head==null){
			return;
		}
		inOrderRecur(head.getLeft());
		System.out.print(head.getValue()+" ");
		inOrderRecur(head.getRight());
	}

	/***
	 * 递归 后序遍历
	 * @param head
	 */
	public static void posOrderRecur(TreeNode head){
		if(head == null){
			return;
		}
		posOrderRecur(head.getLeft());
		posOrderRecur(head.getRight());
		System.out.print(head.getValue() + " ");
	}
	
	/**
	 * 前序遍历 非递归
	 * @param head
	 */
	public static void preOrderUnRecur(TreeNode head){
		System.out.println("pre-order");
		if(head!=null){
			Stack<TreeNode> stack = new Stack<TreeNode>();
			stack.add(head);
			while(!stack.isEmpty()){
				head = stack.pop();
				System.out.print(head.getValue()+" ");
				if(head.getRight() != null){
					stack.push(head.getRight());
				}
				if(head.getLeft() != null){
					stack.push(head.getLeft());
				}
			}
		}
	}
	
	/**
	 * 中序遍历 非递归
	 * @param head
	 */
	public static void inOrderUnRecur(TreeNode head){
		System.out.println("in-order :");
		if(head != null){
		  Stack<TreeNode> stack = new Stack<TreeNode>();
		  while(!stack.isEmpty() || head!=null ){
			  if(head!=null){
				  stack.push(head);
				  head = head.getLeft();
			  }else{
				  head = stack.pop();
				  System.out.print(head.getValue()+" ");
				  head = head.getRight();
			  }
		  }
		}
	}
	
	/**
	 * 后序遍历 非递归
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
				if(c.getLeft()!=null && head!=c.getLeft() && head!=c.getRight()){
					stack.push(c.getLeft());
				}else if(c.getRight()!=null && head!=c.getRight()){
					stack.push(c.getRight());
				}else{
					System.out.print(stack.pop().getValue()+" ");
					head = c;
				}
				 
			}
		}
	}
	
	/**
	 * 二叉树的深度
	 * @param root
	 * @return
	 */
	public static int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int left = 1;
            int right = 1;
            left+=TreeDepth(root.getLeft());
            right+=TreeDepth(root.getRight());
            return left>right?left:right;
        }
    }
	
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		TreeNode lt = new TreeNode(2);
		TreeNode rt = new TreeNode(3);
		tree.setLeft(lt);
		tree.setRight(rt);
 		inOrderRecur(tree);
 		preOrderRecur(tree);
		inOrderUnRecur(tree);
		System.out.println(TreeDepth(tree));
	}

}
