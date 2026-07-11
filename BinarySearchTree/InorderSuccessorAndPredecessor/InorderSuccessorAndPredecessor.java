public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

    TreeNode successor = null;

    while(root != null){

        if(p.val < root.val){
            successor = root;
            root = root.left;
        }

        else if(p.val > root.val){
            root = root.right;
        }

        else{

            if(root.right != null){

                root = root.right;

                while(root.left != null){
                    root = root.left;
                }

                successor = root;
            }

            break;
        }
    }

    return successor;
}