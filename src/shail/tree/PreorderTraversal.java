package shail.tree;

import java.util.ArrayList;

public class PreorderTraversal {

    public static ArrayList<Integer> preorderedList = new ArrayList<Integer>();

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;

        preorder(l1);

        System.out.println(preorderedList);


    }

    public static void preorder(TreeNode root) {


        if(root == null) return;

        preorderedList.add(root.data);

        //Go left
        preorder(root.left);

        //Go right
        preorder(root.right);

    }
}
