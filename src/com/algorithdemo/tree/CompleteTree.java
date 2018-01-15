package com.algorithdemo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  判断二叉树是否为完全二叉树
 *
 * Created by geguofeng on 2018/1/15.
 */
public class CompleteTree {

    public static boolean isCRTree(TreeNode head){
        if(head == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean leaf = false;
        TreeNode l = null;
        TreeNode r = null;
        queue.offer(head);
        while (!queue.isEmpty()){
            head = queue.poll();
            l = head.getLeft();
            r = head.getRight();
            if ((leaf && (l !=null || r!=null)) ||(l == null && r!= null)){
                return false;
            }
            if(l != null){
                queue.offer(l);
            }
            if(r != null){
                queue.offer(r);
            }else {
                leaf = true;
            }
        }
        return true;
    }
}
