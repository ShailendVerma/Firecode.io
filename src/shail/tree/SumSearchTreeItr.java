package shail.tree;


import java.util.LinkedList;

public class SumSearchTreeItr {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(2,null,null);
        TreeNode l2 = new TreeNode(1,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(sumItr(l1));

    }


    public static int sumItr(TreeNode root) {

        if(root == null) return 0;

        int sum = 0;
        LinkedList<TreeNode> queue = new LinkedList <TreeNode>();
        queue.push(root);
        while (!queue.isEmpty())
        {
            TreeNode currNode = queue.pop();
            sum += currNode.data;

            if(currNode.left != null)
            {
                queue.push(currNode.left);
            }

            if(currNode.right !=  null)
            {
                queue.push((currNode.right));
            }
        }

        return sum;


    }


}
