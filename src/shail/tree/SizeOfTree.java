package shail.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class SizeOfTree {


    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(size(l1));


    }

    public static int size(TreeNode root) {

        return sizeRec(root,0);

    }

    private static int sizeRec(TreeNode root, int currentCount) {

        if(root == null) return currentCount;

        currentCount++;

        return sizeRec(root.right,sizeRec(root.left,currentCount));
    }
}
