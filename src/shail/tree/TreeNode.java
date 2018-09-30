package shail.tree;

class TreeNode {
      int data;
      TreeNode left;
      TreeNode right;
      TreeNode(int data, TreeNode left, TreeNode right) {
      this.data = data;
      this.left = left;
      this.right = right;
      }

      @Override
      public String toString() {
            return "Data:"+data;
      }
}