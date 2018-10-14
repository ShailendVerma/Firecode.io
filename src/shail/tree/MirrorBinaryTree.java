package shail.tree;

public class MirrorBinaryTree {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(mirror(l1));

    }

    public static TreeNode mirror(TreeNode root) {

        if(root == null) return root;

        //swap left and right
        TreeNode temp = root.left;

        root.left = root.right;

        root.right = temp;

        //Mirror left
        mirror(root.left);

        mirror(root.right);

        return root;
    }
}
