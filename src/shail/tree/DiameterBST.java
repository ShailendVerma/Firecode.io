package shail.tree;

public class DiameterBST {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(diameter(l1));


    }

    public static int diameter(TreeNode root)  {

        if(root == null)  return 0;

        return heightRec(root)[0];
    }

    public static int[] heightRec(TreeNode root) {

        if (root == null) return new int[]{0,0};

        int[] leftHeight = heightRec(root.left);

        int[] rightHeight = heightRec(root.right);

        int rootHeight =    Math.max(leftHeight[1],rightHeight[1])+1;

        int rootDiameter = leftHeight[1] + rightHeight[1] + 1;


        return new int[]{Math.max(rootDiameter,Math.max(leftHeight[0],rightHeight[0])),
                rootHeight};
    }

}
