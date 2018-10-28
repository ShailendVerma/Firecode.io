package shail.tree;

public class FindKthLargestBSTEntry {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(4,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(8,null,null);
        TreeNode l4 = new TreeNode(6,null,null);

        l1.left =l2;
        l1.right = l3;
        l3.left = l4;


        System.out.println(findKthLargest(l1,2));


    }

    public static TreeNode findKthLargest(TreeNode root, int k) {

        if(root == null) return null;

        int rightSize = getSizeRec(root.right,0);

        System.out.println(rightSize+ ":"+root.data);

        if(rightSize+1 == k)
        {
            return root;
        }

        TreeNode match = findKthLargest(root.right,k);

        if(match != null) return match;

        return findKthLargest(root.left,k - rightSize-1);
    }

    public static int getSizeRec(TreeNode node,int size){

        if(node == null) return size;

        size++;

        return getSizeRec(node.right,getSizeRec(node.left,size));
    }

}
