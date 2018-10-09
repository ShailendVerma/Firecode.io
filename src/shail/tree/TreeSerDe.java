package shail.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSerDe {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);
        TreeNode l4 = new TreeNode(4,null,null);

        l1.left =l2;
        l2.right = l3;
        l2.left = l4;

        String serTree = serializeTree(l1);

        System.out.println(serTree);

        TreeNode deserTree = restoreTree(serTree);

        System.out.println(serializeTree(deserTree));

    }

    public static String serializeTree(TreeNode root){
        if(root == null) return "null";
        return root.data+","+serializeTree(root.left)+","+serializeTree(root.right);
    }

    public static TreeNode restoreTree(String str){
        if(str ==null || "null".equals(str)) return null;
        return restoreTreeRec(new ArrayList<>(Arrays.asList(str.split(","))));

    }

    public static TreeNode restoreTreeRec(List<String> str){
        if(str.size() == 0){ return null;}

        if("null".equals(str.get(0))){
            str.remove(0);
            return null;
        }

        int data = Integer.valueOf(str.get(0));
        str.remove(0);

        TreeNode leftNode = restoreTreeRec(str);

        TreeNode rightNode = restoreTreeRec(str);

        return new TreeNode(data,leftNode,rightNode);
    }

}
