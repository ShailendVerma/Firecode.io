package shail.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DecompressTree {

    public static void main(String args[])
    {

        TreeNode root = decompressTree("1,2,3,4,*,6,*");
        System.out.println(root);

    }

    public static TreeNode decompressTree(String str){

        if(str == null || "".equals(str) || "*".equals(str))
        {
            return null;
        }

        List<String> dataList = new ArrayList<>(Arrays.asList(str.split(",")));
        LinkedList<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)),null,null);
        queue.add(root);
        int index = 1;
        while (index < dataList.size())
        {

            TreeNode parentNode = queue.pop();
            if(parentNode == null) {
                index+=2;
            }else{

                //Handle left
                String leftVal = dataList.get(index);
                if(!"*".equals(leftVal))
                {
                    TreeNode leftNode = new TreeNode(Integer.valueOf(leftVal),null,null);
                    queue.addLast(leftNode);
                    parentNode.left = leftNode;
                }
                System.out.println(index+" : "+parentNode.data+" left val->"+leftVal);
                index++;


                //Handle right
                String rightVal = dataList.get(index);
                if(!"*".equals(rightVal))
                {
                    TreeNode rightNode = new TreeNode(Integer.valueOf(rightVal),null,null);
                    queue.addLast(rightNode);
                    parentNode.right = rightNode;
                }
                System.out.println(index+" : "+parentNode.data+" right val->"+rightVal);
                index++;
            }
        }

        return root;
    }


}
