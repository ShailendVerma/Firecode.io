package shail.tree;

//FIXME  - UNSOLVED
public class ValidateBST {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(2,null,null);
        TreeNode l2 = new TreeNode(1,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(validateBST(l1));

    }


    public static boolean validateBST(TreeNode root) {


        return validateBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    public static boolean validateBST(TreeNode root, int minVal, int maxVal) {

        if(root == null) return true;

        if(root.data < minVal || root.data > maxVal) return false;

        return validateBST(root.left,minVal,root.data) && validateBST(root.right,root.data,maxVal);
    }
}
