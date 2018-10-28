package shail.tree;

import java.util.ArrayList;

public class FindAndPrintAncestors {
    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;


        System.out.println(printAncestors(l1,3));
        System.out.println(ancestorsList);


    }

    public static ArrayList<Integer> ancestorsList = new ArrayList<Integer>();
    public static boolean printAncestors(TreeNode root, int nodeData) {

        if(root == null) return false;
        return printAncestorsRec(ancestorsList,root,nodeData);

    }

    private static boolean printAncestorsRec(ArrayList<Integer> ancestorsList, TreeNode root, int nodeData) {

        if(root == null) return false;

        if(root.data == nodeData) return true;

        //add root to ancestors list
        ancestorsList.add(0,root.data);

        //check left
        if(printAncestorsRec(ancestorsList,root.left,nodeData)){
            return true;
        }

        if(printAncestorsRec(ancestorsList,root.right,nodeData)){
            return true;
        }

        //remove last
        ancestorsList.remove(0);
        return false;
    }
}
