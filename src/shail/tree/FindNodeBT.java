package shail.tree;

import shail.linkedlist.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//FIXME  - UNSOLVED
public class FindNodeBT {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(2,null,null);
        TreeNode l2 = new TreeNode(1,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(findNode(l1, 6));

    }


    public static TreeNode findNode(TreeNode root, int val) {


        if(root == null) return null;

        LinkedList<TreeNode> nodes = new LinkedList<>();

        //Push root
        nodes.push(root);

        TreeNode current = root;
        while(!nodes.isEmpty())
        {
            current = nodes.pop();
            //Check current node
            System.out.println("In node:"+current);
            if(current.data == val) return current;

            //If left is not null push it
            if(current.left != null){
                nodes.push(current.left);
            }


            //If left is not null push it
            if(current.right != null){
                nodes.push(current.right);
            }

        }

        return null;


    }


}
