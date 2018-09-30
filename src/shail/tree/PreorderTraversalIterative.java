package shail.tree;

import java.util.*;
import java.util.stream.Collectors;

public class PreorderTraversalIterative {


    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(preorderItr(l1));


    }

    public static ArrayList<Integer> preorderItr(TreeNode root) {

        ArrayList<Integer> preorder = new ArrayList<>();
        if(root == null) return preorder;

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.push(root);

        while(!nodes.isEmpty())
        {
            TreeNode current  = nodes.pop();
            preorder.add(current.data);

            //Push right - to process later
            if(current.right != null)
            {
                nodes.push(current.right);
            }

            //Push left to process current
            if(current.left !=  null)
            {
                nodes.push(current.left);
            }

        }

        return preorder;

    }
}
