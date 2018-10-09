package shail.tree;

public class FindLengthST {

    public static void main(String args[]){
        TreeNode l1 = new TreeNode(2,null,null);
        TreeNode l2 = new TreeNode(1,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(pathLengthFromRoot(l1,3));
    }


    public static int pathLengthFromRoot(TreeNode root, int n1) {

        if(root == null) return 0;
        if(root.data == n1) return 1;

        //Search left
        int leftVal = pathLengthFromRoot(root.left,n1);

        //Search Right
        int rightVal = pathLengthFromRoot(root.right,n1);

        int val = (rightVal > leftVal)?rightVal:leftVal;

        return (val > 0)?val +1:0;

    }
}
