package shail.tree;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class ValidateBSTItr {

    public static void main(String args[])
    {
        TreeNode l20 = new TreeNode(20,null,null);
        TreeNode l15 = new TreeNode(15,null,null);
        TreeNode l40 = new TreeNode(40,null,null);
        TreeNode l10 = new TreeNode(10,null,null);
        TreeNode l30 = new TreeNode(30,null,null);

        l20.left = l15;
        l20.right = l40;
        l15.left = l10;
        l15.right = l30;

        System.out.println(validateBSTItr(l20));

    }
    
    public static class TreeNodeHolder{
        
        public TreeNode node;
        public int min;
        public int max;
        
        TreeNodeHolder(TreeNode node,int min,int max)
        {
            this.node = node;
            this.min = min;
            this.max = max;
        }
        
        
    }

    public static boolean validateBSTItr(TreeNode root) {

        if(root == null) return true;
        LinkedList<TreeNodeHolder> queue = new LinkedList<>();
        queue.push(new TreeNodeHolder(root, Integer.MIN_VALUE,Integer.MAX_VALUE));
        TreeNodeHolder currentNode;
        TreeNode currTreeNode;
        while (!queue.isEmpty())
        {

            currentNode = queue.pop();
            currTreeNode = currentNode.node;
            System.out.println(currentNode + ":" +currentNode.min + " :"+currentNode.max);
            if(currTreeNode.left != null)
            {
                if(currentNode.min < currTreeNode.left.data  && currTreeNode.left.data < currTreeNode.data )
                {
                    queue.push(new TreeNodeHolder(currTreeNode.left,currentNode.min,currTreeNode.data));
                } else {
                   return false;
                }
            }
            if(currTreeNode.right != null)
            {
                if( currTreeNode.data < currTreeNode.right.data && currTreeNode.right.data < currentNode.max)
                {
                    queue.push(new TreeNodeHolder(currTreeNode.right,currTreeNode.data,currentNode.max));
                } else {
                    return false;
                }
            }

        }
        return  true;

    }
}
