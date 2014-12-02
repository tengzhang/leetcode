package com.tcheung;

/**
 * SameTree
 *
 * @author: zhangteng
 * @time: 2014/12/2 22:52
 */
public class SameTree {

    class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null || q==null) {
            return p==q;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean lSame = isSameTree(p.left, q.left);
        boolean rSame = isSameTree(p.right, q.right);
        return lSame && rSame;
    }
}
