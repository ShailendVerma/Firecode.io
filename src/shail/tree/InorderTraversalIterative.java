package shail.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class InorderTraversalIterative {


    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(inorderItr(l1));


    }

    public static ArrayList<Integer> inorderItr(TreeNode root) {


        ArrayList<Integer> inorderVals = new ArrayList<>();
        if(root == null)return inorderVals;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current =  root;
        while(current != null || !stack.isEmpty()) {
            if(current != null)
            {
                stack.push(current);
                current = current.left;
            }else{
                current = stack.pop();
                inorderVals.add(current.data);
                current = current.right;
            }
        }

        return inorderVals;
    }
}
