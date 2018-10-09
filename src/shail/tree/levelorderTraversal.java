package shail.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class levelorderTraversal {



    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(levelOrder(l1));


    }

    public static ArrayList<Integer> levelOrder(TreeNode root){

        ArrayList<Integer> data = new ArrayList<>();
        if(root == null) return data;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        TreeNode currentNode = null;

        while (!queue.isEmpty()){

            currentNode = queue.pop();
            data.add(currentNode.data);
            System.out.println(currentNode.data);
            if(currentNode.left!=null) queue.addLast(currentNode.left);
            if(currentNode.right!=null) queue.addLast(currentNode.right);

        }

        return data;
    }
}
