package com.algorithdemo.tree;

import java.util.LinkedList;
import java.util.Queue;


/**
 * 题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 */
public class Solution {
	
	  public static void printFromTopToBottom(TreeNode root) {
		  if(root == null){
			  return;
		  }
		  Queue<TreeNode> queue = new LinkedList<TreeNode>();
		  TreeNode last = root;
		  TreeNode nLast = null;
		  queue.offer(root);
		  while(!queue.isEmpty()){
			root = queue.poll();
			System.out.print(root.getValue() + " ");
			if(root.getLeft() != null){
				queue.offer(root.getLeft());
				nLast = root.getLeft();
			}
			if(root.getRight() != null){
				queue.offer(root.getRight());
				nLast = root.getRight();
			}
			if(root == last && !queue.isEmpty()){
                 last = nLast;
			}
		  }
	  }
	  
	  public static void main(String[] args) {
		  TreeNode tree = new TreeNode(1);
			TreeNode lt = new TreeNode(2);
			TreeNode rt = new TreeNode(3);
			tree.setLeft(lt);
			tree.setRight(rt);
			printFromTopToBottom(tree);
	}

}
