package shail.tree;

import sun.print.CUPSPrinter;

import java.util.*;

public class PrintLevelByLevelBT {

    public static void main(String args[])
    {
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode l2 = new TreeNode(2,null,null);
        TreeNode l3 = new TreeNode(3,null,null);

        l1.left = l2;
        l1.right = l3;

        System.out.println(printLevelByLevel(l1));

    }

    public static ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {

        ArrayList<ArrayList<Integer>> dataList = new ArrayList<>();
        Map<TreeNode,Integer> nodeLevel = new HashMap<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        if(root == null) return dataList;
        queue.push(root);
        nodeLevel.put(root,0);
        while(!queue.isEmpty())
        {
            TreeNode currentNode = queue.pop();
            int level = nodeLevel.get(currentNode);
            System.out.println(currentNode+"->"+level);

            ArrayList<Integer> levelList = (dataList.size()> level)?dataList.get(level):null;
            if(levelList == null)
            {
                levelList = new ArrayList<>();
                dataList.add(levelList);
            }
            levelList.add(currentNode.data);

            if(currentNode.left != null) {queue.push(currentNode.left);nodeLevel.put(currentNode.left,level+1);}
            if(currentNode.right != null) {queue.push(currentNode.right);nodeLevel.put(currentNode.right,level+1);}
        }

        return dataList;
    }
}
