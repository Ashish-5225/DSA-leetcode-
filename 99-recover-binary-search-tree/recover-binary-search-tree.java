class Solution {
    public void recoverTree(TreeNode root) {
        
        List<TreeNode> list = new ArrayList<>();
        
        inorder(root, list);

        TreeNode first = null;
        TreeNode second = null;

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).val > list.get(i + 1).val) {

                if (first == null) {
                    first = list.get(i);
                }

                second = list.get(i + 1);
            }
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root, List<TreeNode> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);

        list.add(root);

        inorder(root.right, list);
    }
}