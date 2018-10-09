package shail.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class InsertBST {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(insert(l1,6));


    }

    public static TreeNode insert(TreeNode root, int data) {

        if(root == null)  return new TreeNode(data,null,null);
        //insert such that left
        insertRec(root,new TreeNode(data,null,null));

        return root;
    }

    public static void insertRec(TreeNode root, TreeNode node2Insert){
        if(root.data > node2Insert.data) //Check left
        {
            if(root.left  == null)
            {
                root.left = node2Insert;
            }else {
                insertRec(root.left,node2Insert);
            }
        }else if(root.data < node2Insert.data){
            if(root.right  == null)
            {
                root.right = node2Insert;
            }else {
                insertRec(root.right,node2Insert);
            }
        }
    }

}
