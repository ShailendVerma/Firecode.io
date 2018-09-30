package shail.tree;


public class SumSearchTree {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(2,null,null);
        TreeNode l2 = new TreeNode(1,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(sum(l1));

    }


    public static int sum(TreeNode root) {

        if(root == null) return 0;

        return sum(root.left) + root.data + sum(root.right);

    }


}
