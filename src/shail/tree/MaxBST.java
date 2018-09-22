package shail.tree;

//FIXME  - UNSOLVED
public class MaxBST {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(2,null,null);
        TreeNode l2 = new TreeNode(1,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(findMax(l1));

    }


    public static int findMax(TreeNode root) {

        return maxST(root,Integer.MIN_VALUE);

    }

    public static int maxST(TreeNode root, int maxVal) {

        if(root == null) return maxVal;

        //Check left
        int maxLeft = maxST(root.left,root.data) ;

        //Check Right
        int maxRight = maxST(root.right,root.data) ;

        return (maxLeft > maxRight)? maxLeft:maxRight;
    }


}
