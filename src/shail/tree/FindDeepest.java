package shail.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindDeepest {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(findDeepest(l1));


    }

    public static TreeNode findDeepest(TreeNode root) {

        if(root == null || (root.left == null && root.right == null)) return root;
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<TreeNode> arr = new ArrayList<>();
        queue.push(root);
        while (!queue.isEmpty())
        {
            TreeNode currentNode = queue.pop();
            if(currentNode.left != null){queue.addLast(currentNode.left);arr.add(currentNode.left);}
            if(currentNode.right != null){queue.addLast(currentNode.right);arr.add(currentNode.right);}

        }

        return arr.get(arr.size() - 1);
    }
}
