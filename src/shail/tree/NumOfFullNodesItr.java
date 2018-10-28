package shail.tree;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfFullNodesItr {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(numberOfFullNodes(l1));


    }

    public static int numberOfFullNodes(TreeNode root) {

        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode current;
        int fullNodeCount = 0;
        while (!queue.isEmpty()) {
            current = queue.poll();

            if(current.left != null && current.right != null)
            {
                fullNodeCount++;
            }

           if(current.left != null){ queue.add(current.left);}

           if(current.right != null){ queue.add(current.right);}

        }

        return fullNodeCount;
    }
}
