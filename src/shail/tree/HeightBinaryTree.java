package shail.tree;


public class HeightBinaryTree {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(2,null,null);
        TreeNode l2 = new TreeNode(1,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(findHeight(l1));

    }


    public static int findHeight(TreeNode root) {

        if(root == null) return 0;

        int leftHeight =  findHeight(root.left);
        int rightHeight =  findHeight(root.right);

        return 1 + ((leftHeight > rightHeight)?leftHeight:rightHeight);
    }

}
