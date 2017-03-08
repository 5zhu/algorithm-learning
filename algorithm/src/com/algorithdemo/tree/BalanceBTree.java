package com.algorithdemo.tree;

/**
 * 平衡二叉树
 * 
 * 《剑指Offer》题目：输入一棵二叉树，判断该二叉树是否是平衡二叉树。 
 * @author ge
 *
 */
public class BalanceBTree {

	/**
	 * 判断root是否为平衡二叉树
	 * @param root
	 * @return
	 */
    public boolean IsBalanced_Solution(TreeNode root) {
        boolean [] res = new boolean[1];
        res[0] = true;
        getHeight(root, 1, res);
        return res[0];
    }
    
    public int getHeight(TreeNode head, int level, boolean[] res){
        if(head==null){
            return level;
        }
        int lH = getHeight(head.getLeft(), level + 1, res);
        if(!res[0]){
            return level;
        }
        int rH =  getHeight(head.getRight(), level + 1, res);
         if(!res[0]){
            return level;
        }
        if(Math.abs(lH-rH) > 1 ){
            res[0] = false;
        }
        return Math.max(lH, rH);
    }
}
