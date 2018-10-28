package shail.tree;

public class MaxSumPath {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(maxSumPath(l1));


    }


    public static int maxSumPath(TreeNode root) {

        return maxSumPathRec(root,0);
    }

    public static int maxSumPathRec(TreeNode root,int currSum)
    {
        if(root == null) return 0;

        if(currSum == 0)
        {
            currSum = root.data;
        }


        //Check children
        return maxSumPathRec(root.left,currSum)+maxSumPathRec(root.right,currSum)+root.data;

    }

}
